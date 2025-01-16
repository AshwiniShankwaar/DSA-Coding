package javaRevision.CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncronisedCollectionDemo {
    public static void main(String[] args) {

        List<String> l = new ArrayList<String>();
        List<String> list = Collections.synchronizedList(l);
        //same way we can use synchronizedSet(), and other synchronization collections

        Object lock = new Object();
        Runnable r1 = ()->{
            synchronized (lock) {
                for (String s : "Ashiwni".split("")) {
                    list.add(s);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }

                }
                System.out.println("notifying waiting threads");
                lock.notify();
            }
        };
        Runnable r2 = ()->{
            synchronized (lock) {
                if(list.size() == 0){
                    try{
                        System.out.println("going to waiting section");
                        lock.wait();
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    }
                }
                list.stream().forEach((e) -> {
                    System.out.println(e);
                });
            }
        };
        Thread t1 = new Thread(r2);
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();

    }
}
