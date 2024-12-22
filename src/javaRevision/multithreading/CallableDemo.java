package javaRevision.multithreading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        MyCallable[] jobs = new MyCallable[]{
                new MyCallable(10),
                new MyCallable(20),
                new MyCallable(30),
                new MyCallable(40),
                new MyCallable(50),
                new MyCallable(60),
                new MyCallable(70),
                new MyCallable(80),
                new MyCallable(90),
                new MyCallable(100),
        };
        ExecutorService service = Executors.newFixedThreadPool(3);
        ArrayList<Integer> output = new ArrayList<Integer>();
        for(MyCallable job :jobs){
            Future f = service.submit(job);
            try{output.add((Integer) f.get());
            }catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            catch (ExecutionException e){e.printStackTrace();}
        }
        Iterator<Integer> it = output.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }
    }
}

class MyCallable implements Callable {
    Integer num;
    MyCallable(Integer num){
        this.num = num;
    }
    public Object call() throws Exception{
        return num*num;
    }
}
