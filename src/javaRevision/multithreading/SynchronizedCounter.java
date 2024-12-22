package javaRevision.multithreading;

public class SynchronizedCounter {
    private int count = 0;
    public synchronized void increment() {
        // Simulate some time-consuming operation
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        count++;
    }
    public int getCount() {
        return count;
    }
    public static void main(String[] args) {
        SynchronizedCounter counter = new SynchronizedCounter();
        // Create multiple threads to increment the counter
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            }).start();
        }
        // Wait for all threads to finish
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Print the final count
        System.out.println("Final Count: " + counter.getCount());
    }
}
