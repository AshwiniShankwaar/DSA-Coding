package javaRevision.multithreading;

import java.text.Format;
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ForkAndJoinDemo {
    public static void main(String[] args) {
        int[] data =  IntStream.iterate(1,(x)->x+1).limit(10000).toArray();
        System.out.println("original data: ");
        Arrays.stream(data).forEach(x->System.out.print(x+" "));

//        SqrtTransformation sqrt = new SqrtTransformation(data,0,data.length);
//        ForkJoinPool pool = new ForkJoinPool();
//        pool.invoke(sqrt);
//        System.out.println();
//        System.out.println("transformed data :");
//        Arrays.stream(data).forEach(x->System.out.print(x+" "));


        SumTransformation sum = new SumTransformation(data,0,data.length);
        ForkJoinPool pool = new ForkJoinPool();
        double sumOfNums = pool.invoke(sum);
        System.out.println();
        String out = String.format("sum is %.2f",sumOfNums);
        System.out.println(out);
    }
}
class SumTransformation extends RecursiveTask<Double>{

    int threshold = 100;
    int[] data;
    int start;
    int end;

    SumTransformation(int[] data, int start, int end){
        this.data = data;
        this.start = start;
        this.end = end;
    }
    @Override
    protected Double compute() {
        double sum = 0;
        if((end-start)<=threshold){
            for (int i = start; i < end; i++) {
                if(data[i]%2==0) {
                    sum += data[i];
                }else{
                    sum -=data[i];
                }
            }
        }else{
            int mid = (start+end)/2;
            SumTransformation left = new SumTransformation(data,start,mid);
            SumTransformation right = new SumTransformation(data,mid,end);

            left.fork();
            right.fork();

            sum = left.join()+right.join();
        }
        return sum;
    }
}

class SqrtTransformation extends RecursiveAction{

    int threshold = 1000;
    int[] data;
    int start;
    int end;

    SqrtTransformation(int[] data,int start,int end){
        this.data = data;
        this.start = start;
        this.end = end;
    }
    @Override
    protected void compute() {
        if((end-start)<threshold){
            for (int i = start; i < end; i++) {
                if(i%2==0) {
                    data[i] = (int) Math.pow(i, 2);
                }else{
                    data[i] = i;
                }
            }
        }else{
            int mid = (start+end) >>> 1;
            invokeAll(
                    new SqrtTransformation(data,start,mid),
                    new SqrtTransformation(data,mid,end)
            );
        }
    }
}