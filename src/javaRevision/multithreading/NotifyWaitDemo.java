package javaRevision.multithreading;

import java.util.ArrayList;

public class NotifyWaitDemo {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        Object lock = new Object();

        // Producer thread
        Runnable producer = () -> {
            synchronized (lock) {
                for (int i = 0; i < 20; i++) {
                    list.add(Math.pow(i, 2));
                    System.out.println("Produced: " + Math.pow(i, 2));

                    // Notify consumer thread after adding an item
                    lock.notify();

                    try {
                        // Simulate production time
                        Thread.sleep(500);

                        // Wait if more items need to be consumed
                        if (i < 19) {
                            lock.wait();
                        }
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        };

        // Consumer thread
        Runnable consumer = () -> {
            synchronized (lock) {
                for (int i = 0; i < 20; i++) {
                    try {
                        // Wait until producer adds an item
                        if (list.size() <= i) {
                            lock.wait();
                        }
                        System.out.println("Consumed: " + list.get(i));

                        // Notify producer to produce the next item
                        lock.notify();
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        };

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("All items produced and consumed.");
    }
}

