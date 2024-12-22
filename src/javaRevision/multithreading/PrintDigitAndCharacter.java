package javaRevision.multithreading;

public class PrintDigitAndCharacter {
    private static final Object lock = new Object();
    private static boolean isNumberTurn = true;

    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            public void run(){
                for (int i = 1; i < 6; i++) {
                    synchronized (lock){
                        while (!isNumberTurn){
                            try{
                                lock.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        System.out.printf("%d",i);
                        isNumberTurn= false;
                        lock.notify();

                    }
                }
            }
        };
        Thread thread2 = new Thread(){
            public void run(){
                for (char x = 'a';x<'f';x++) {
                    synchronized (lock){
                        while (isNumberTurn){
                            try{
                                lock.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        System.out.printf("%c",x);
                        isNumberTurn= true;
                        lock.notify();

                    }
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}
