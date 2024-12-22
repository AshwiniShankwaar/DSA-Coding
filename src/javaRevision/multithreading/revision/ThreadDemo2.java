package javaRevision.multithreading.revision;

public class ThreadDemo2 {
    private int counter =0;

    public synchronized void increment(){
        counter++;
    }
    public int getCounter(){
        return counter;
    }
    public static void main(String[] args) {
        ThreadDemo2 demo = new ThreadDemo2();
       for(int i=0;i<100;i++){//create threate 10
           new Thread(()->{
               for(int j=0;j<100;j++){
                   demo.increment();
               }
           }).start();
       }
       try{
           Thread.sleep(2000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
        System.out.println(demo.getCounter());
    }
}
