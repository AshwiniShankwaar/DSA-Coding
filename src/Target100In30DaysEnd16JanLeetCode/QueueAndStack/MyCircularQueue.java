package Target100In30DaysEnd16JanLeetCode.QueueAndStack;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class MyCircularQueue {
    int[] arr;
    int s, e, size, capacity;

    public MyCircularQueue(int k) {
        this.arr = new int[k];
        this.s = -1;
        this.e = -1;
        this.size = 0;
        this.capacity = k;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            s = 0;
        }
        e = (e + 1) % capacity; // Move to the next position circularly
        arr[e] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        if (s == e) { // Only one element left
            s = -1;
            e = -1;
        } else {
            s = (s + 1) % capacity; // Move to the next position circularly
        }
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return arr[s];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[e];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }


    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(5);
        int[] arr = new int[]{1,2,3,4,5,6};
        Arrays.stream(arr).forEach(x-> System.out.println(myCircularQueue.enQueue(x)));
        System.out.println(myCircularQueue.Rear());     // return 5
        System.out.println(myCircularQueue.isFull());   // return True
        System.out.println(myCircularQueue.deQueue());  // return True
        System.out.println(myCircularQueue.deQueue());  // return True
        System.out.println(myCircularQueue.enQueue(10)); // return True
        System.out.println(myCircularQueue.enQueue(11)); // return True
        System.out.println(myCircularQueue.enQueue(12)); // return False
        System.out.println(myCircularQueue.Rear());     // return 11
    }
}
