package javaRevision.multithreading.revision;

public class ThreadDemo {
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName()
//                +" "+Thread.currentThread().getThreadGroup());
//        MyThread myThread = new MyThread();
//        myThread.setName("Ankita-thread");
//        myThread.setPriority(Thread.MAX_PRIORITY);
//        myThread.start();//internally call run()
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable,"Ankita-thread");
//        myThread.isDaemon();
//        myThread.setDaemon(true);
        myThread.start();
//        try {
//            myThread.join();
//        }catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        for (int i = 0; i < 10; i++) {
//            try{
//                Thread.sleep(4000);
//            }catch(InterruptedException e){
//                e.printStackTrace();
//            }

            System.out.println("Ashwini");
        }
//        myThread.interrupt();
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run(){
//       System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("Ankita");
//            try{Thread.sleep(3000);}
//            catch (InterruptedException e){
//                e.printStackTrace();
//            }
//            Thread.yield();
        }

    }
}

//class MyThread extends Thread{
//    public void run(){
//        System.out.println(Thread.currentThread().getName());
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Ankita");
//        }
//    }
//}

