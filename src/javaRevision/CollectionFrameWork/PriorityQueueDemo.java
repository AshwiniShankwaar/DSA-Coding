package javaRevision.CollectionFrameWork;

import java.util.PriorityQueue;

/**
 * A PriorityQueue in Java is a data structure that operates on the principles of a heap. It is part
 * of the java.util package and is commonly used to process elements based on their priority.
 *
 * Key Features:
 * Order: By default, a PriorityQueue is a min-heap, meaning the smallest element is always at the front.
 * For a max-heap, you need to provide a custom comparator.
 * Dynamic Resizing: The size of the PriorityQueue adjusts dynamically as elements are added or removed.
 * Efficient Operations: Insertion and removal of the highest-priority element take
 * O(log n),while retrieval of the highest-priority element takes O(1)
 * */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        //create a priority queue
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a,b)->b-a);

        //to insert elements

        minHeap.add(10);
        minHeap.offer(20);
        minHeap.add(3);
        minHeap.add(15);
        minHeap.offer(25);

        //to access the top element

        int head = minHeap.peek(); //Use peek() to retrieve the smallest element without removing it.
        //for maxheap Use peek() to retrieve the largest element without removing it.

        //Use poll() to retrieve and remove
        int min = minHeap.poll();

        int size = minHeap.size(); //get size
        boolean isEmpty = minHeap.isEmpty(); //check if heap is empty


        /**
         * Use Cases:
         * -> Finding the Kth Largest/Smallest Element:
         * Efficiently handles large datasets for problems like finding the Kth largest element.
         * -> Task Scheduling: Manages tasks based on priority.
         * -> Merging K Sorted Arrays: Combines sorted arrays efficiently.
         * -> Dijkstra’s Algorithm: Used for finding the shortest path in graphs.
         * **/
    }
}
