package javaRevision.multithreading;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CooncurrentCollectionDemo {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        //same way we can use copyonWriteArraySet()
        //and ConcurrentHashMap and ConcurrentSkipList and concurrentskipset
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                try{
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                list.add(i*2);
                System.out.println("c:"+i*2);
            }
        });
        Thread t2 = new Thread(()->{
            for (int i=0; i<100;i++){
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("p:"+list.get(i));
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
