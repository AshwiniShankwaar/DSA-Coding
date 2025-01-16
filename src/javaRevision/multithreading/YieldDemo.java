package javaRevision.multithreading;

import java.util.ArrayList;

public class YieldDemo {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();

        Runnable r1 = ()->{
            for (int i = 0; i < 20; i++) {
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
                list.add(Math.pow(i,2));
                if (i == 10) Thread.yield();
            }
        };



        Thread t1 = new Thread(r1);
        t1.start();
        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("call yield method on t1 after 200 milliseconds");

        Runnable r2 = ()->{
//            try {
//                t1.join(); //as soon as the t2 start running it will call t1.join and t2 will be in
//                //waiting state once the t1 task finish it will move forward to complete its task
//            }catch(InterruptedException e){
//                System.out.println(e.getMessage());
//            }
            System.out.println("Thread t2 is running");
            System.out.println("printing....");
            for(double d:list) {
                System.out.println(d);
            }
            try{
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        //make t2 to wait t1 to complete the task
//        try{
//            t1.join(); //but here main thread is waiting for the t1 to complete then only it create t2
//            //then call for start()
//        }catch(InterruptedException e){
//            System.out.println(e.getMessage());
//        }
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
