package javaRevision.multithreading;

public class ThreadDemo1 {

    public static void main(String[] args){
//       Thread myThread = new Thread(){
//           @Override
//           public void run() {
//               for (int i = 0; i < 5; i++) {
//                   System.out.println("called inside thread");
//               }
//           }
//       };

//        MyThread myThread = new MyThread();

        Runnable myRunnable = new MyRunnable();
        Thread currecntThread = Thread.currentThread();
        Thread myThread = new Thread(myRunnable);
//        myThread.setPriority(Thread.MIN_PRIORITY);
//        Thread myThread2 = new Thread(myRunnable);
//        myThread2.setPriority(Thread.MAX_PRIORITY);
        myThread.start();
//        myThread2.start();
//        try{Thread.sleep(3000);}catch(InterruptedException e){
//            e.printStackTrace();
//        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d",i);
//            System.out.println("called inside main method ".concat(Thread.currentThread().getName()));
//            System.out.printf("called from thread: %s%n",Thread.currentThread().getName());
        }


    }
}



class MyRunnable implements Runnable{

    @Override
    public void run() {

        for (char c = 'a'; c<'f'; c++) {

            System.out.printf("%c",c);
        }

////        Thread.currentThread().setName("threadDemo-1");
////        for(int i = 0;i<5;i++){
////            Thread.yield();
////            System.out.printf("thread priority: %d%n",Thread.currentThread().getPriority());
////            System.out.println(String.format("called from thread: %s",Thread.currentThread().getName()));
//        //}
    }
}
//class MyThread extends Thread{
//    public void run(){
//        for (int i = 0; i < 5; i++) {
//            System.out.println("called from thread class");
//        }
//    }
//}