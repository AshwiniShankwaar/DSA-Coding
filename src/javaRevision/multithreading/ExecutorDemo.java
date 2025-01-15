package javaRevision.multithreading;

import java.util.concurrent.*;

public class ExecutorDemo {
    public static void main(String[] args) {


//        Thread[] threads = new Thread[10];
        long l = System.currentTimeMillis();
//        for (int i = 1; i <= 10; i++) {
//            int finalI = i;
//            Thread t = new Thread(new MyRunnable(){
//                @Override
//                public void run() {
//                    try{
//                        Thread.sleep(3000);
//                    } catch (InterruptedException e) {
//                        System.out.println(e.getMessage());
//                    }
//                    System.out.println(new ExecutorDemo().factorial(finalI));
//                }
//            });
//            t.start();
//            threads[i-1] = t;
//        }
//        for (int i = 0; i < 10; i++) {
//            try {
//                threads[i].join();
//            } catch (InterruptedException e) {
//                System.out.println(e.getMessage());
//            }
//        }

        //now performing same task using executarservice

//        ExecutorService executor = Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 10; i++) {
//            int finalI = i+1;
//            executor.submit(
//                    ()->{
//                        try{
//                            Thread.sleep(3000);
//                        } catch (InterruptedException e) {
//                            System.out.println(e.getMessage());
//                        }
//                        System.out.println(new ExecutorDemo().factorial(finalI));
//
//                    });
//        }
//        try {
//            executor.awaitTermination(3000, TimeUnit.MILLISECONDS);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("time taken: "+(System.currentTimeMillis()-l));
//        executor.shutdown();

        //now executor using callable thread

        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            int finalI = i+1;
            Future<Integer> f = executor.submit(()->new ExecutorDemo().factorial(finalI));
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("time taken: "+(System.currentTimeMillis()-l));
        executor.shutdown();
    }

    public int factorial(int i){
        if(i == 0) return 1;
        return i*factorial(i-1);
    }
}
