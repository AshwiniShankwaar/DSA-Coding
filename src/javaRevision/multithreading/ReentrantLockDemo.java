package javaRevision.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> resource.performTask("Thread-1"));
        Thread t2 = new Thread(() -> resource.performTask("Thread-2"));

        t1.start();
        t2.start();
    }
}

class SharedResource {
    private final Lock lock = new ReentrantLock();

    public void performTask(String threadName) {
        lock.lock(); // Acquire the lock
        try {
            System.out.println(threadName + " acquired the lock.");

            // Re-enter the lock
            lock.lock();
            try {
                System.out.println(threadName + " re-entered the lock.");
                // Simulate some work
                Thread.sleep(1000);
            } finally {
                lock.unlock(); // Release the re-entered lock
                System.out.println(threadName + " released re-entered lock.");
            }

            // Simulate more work
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            lock.unlock(); // Release the outer lock
            System.out.println(threadName + " released the lock.");
        }
    }
}
