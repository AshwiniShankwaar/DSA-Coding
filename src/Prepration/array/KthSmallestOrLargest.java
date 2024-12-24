package Prepration.array;

import java.util.HashMap;
import java.util.Map;

public class KthSmallestOrLargest {
    /**
     * Finds the kth smallest and kth largest elements in the given array using merge sort.
     * 
     * This method sorts the input array using merge sort and then retrieves the kth smallest
     * and kth largest elements based on the given position.
     *
     * @param arr      The input array of integers to be processed.
     * @param position The position k for which to find the kth smallest and kth largest elements.
     *                 Must be a positive integer not greater than the array length.
     * @return A Map containing two entries:
     *         - "min": The kth smallest element in the array.
     *         - "max": The kth largest element in the array.
     *         If the array is empty or the position is invalid, the method may return an empty Map
     *         or undefined behavior may occur.
     */
    public Map<String,Integer> KthValueUsingMergeSort(int[] arr, int position){
        if(position> arr.length || arr.length ==0)
            System.out.println("position should be smaller then array size");
        int n = arr.length;
        Map<String,Integer> res = new HashMap<String,Integer>();
        if(n<2 && position == 1){
            res.put("max",arr[0]);
            res.put("min",arr[0]);
        }
        mergeSort(arr);
        int max = arr[arr.length-position];
        int min = arr[position-1];
        res.put("max",max);
        res.put("min",min);
        return res;
    }
    /**
     * Sorts the given array using the merge sort algorithm.
     * This method recursively divides the array into two halves,
     * sorts each half, and then merges the sorted halves.
     *
     * @param arr the array to be sorted. The array is sorted in place.
     *
     * @logic first it will check for if the array size is less than 2 or not if it is less than 2 then
     * return else it will find the middle of the array then it will crate two array left and right
     * after which left,right are populated once array is divided till the last element it will then go
     * go to the joinsort method to merge two array by comparison of the element
     *
     * ex: [1,6,8,3,9,5,10,2]
     *      [1,6,8,3]           [9,5,10,2]
     *    [1,6]    [8,3]      [9,5]       [10,2]
     *  [1]  [6] [8]  [3]   [9]  [5]    [10]   [2]
     *    [1,6]    [3,8]      [5,9]        [2,10]
     *      [1,3,6,8]             [2,5,9,10]
     *            [1,2,3,5,6,8,9,10]
     *  */
    public void mergeSort(int[] arr){
        int n = arr.length;
        if(n<2) return;
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i-mid] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        joinSort(left,right,arr);
    }

    /**
     * Merges two sorted subarrays into a single sorted array.
     * This method takes two sorted arrays, left and right, and merges them
     * into the provided array arr in sorted order.
     *
     * @param left the first sorted subarray to be merged.
     * @param right the second sorted subarray to be merged.
     * @param arr the array into which the merged result is stored. 
     *            It should have enough space to hold all elements from both left and right arrays.
     */
    private void joinSort(int[] left, int[] right, int[] arr) {
        int nl = left.length;
        int nr = right.length;
        int i=0,j=0,k=0;
        while (i<nl && j<nr){
            if(left[i]<right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
        while(i<nl)
            arr[k++] = left[i++];
        while (j<nr)
            arr[k++] = right[j++];
    }

    /**
     * Finds the kth largest element in the given array using a max heap.
     * 
     * This method builds a max heap from the input array and then extracts
     * the kth largest element by performing k extractions from the heap.
     *
     * @param arr      The input array of integers to be processed.
     * @param position The position k for which to find the kth largest element.
     *                 Must be a positive integer not greater than the array length.
     * @return A Map containing a single entry:
     *         - "max": The kth largest element in the array.
     *         If the array is empty or the position is invalid, the method may return
     *         an empty Map or undefined behavior may occur.
     */
    public Map<String,Integer> KthValueUsingMaxMinHeap(int[] arr,int position){
        Map<String,Integer> res = new HashMap<String,Integer>();
//        int[] inputarr = arr.clone();
//            buildMaxHeap(arr);

            buildMinHeap(arr);
    
//        int kthvalue = -1;
//        int heapsize = arr.length;
//        for (int i = 0; i < position; i++) {
//            try{
//                kthvalue = extractKthMaxValue(arr,heapsize);
//                heapsize--;
//            }catch (IllegalArgumentException e){
//                System.out.println(e.getMessage());
//            }
//        }
//        res.put("max",kthvalue);
        int kthMinValue = -1;
        int heapSize = arr.length;
        for (int i = 0; i < position; i++){
            try{
                kthMinValue = extractKthMinValue(arr,heapSize--);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        res.put("min",kthMinValue);
        return res;
    }

    private int extractKthMinValue(int[] arr, int i) {
        if(i<=0) throw new IllegalArgumentException("heap underflow");
        int min = arr[0];
        arr[0] = arr[i-1];
        minHipyfy(arr,i,0);
        return min;
    }

    private void buildMinHeap(int[] arr) {
        int size = arr.length;
        for (int i = (size/2)-1; i >=0 ; i--) {
            minHipyfy(arr,size,i);
        }
    }

    private void minHipyfy(int[] arr, int size, int pos) {
        int smallest = pos;
        int leftChild = leftChild(pos);
        int rightChild = rightChild(pos);

        if(leftChild<size && arr[leftChild]<arr[smallest]){
            smallest = leftChild;
        }
        if(rightChild<size && arr[rightChild]<arr[smallest]){
            smallest = rightChild;
        }
        if(smallest!=pos){
            swap(arr,smallest,pos);
            minHipyfy(arr,size,smallest);
        }

    }

    /**
     * Extracts and returns the maximum value from the heap while maintaining the heap property.
     * This method removes the root element (maximum value) from the heap, replaces it with the last element,
     * and then restores the heap property by calling the hypify method.
     *
     * @param arr  The array representing the heap.
     * @param size The current size of the heap.
     * @return     The maximum value (root) extracted from the heap.
     * @throws IllegalArgumentException If the heap is empty (size <= 0).
     */
    private int extractKthMaxValue(int[] arr, int size) throws IllegalArgumentException {
        if(size<=0){
            throw new IllegalArgumentException("Heap underflow");
        }
        int max = arr[0];
        arr[0] = arr[size-1];
        maxHypify(arr, size,0);
        return max;
    }

    private void buildMaxHeap(int[] arr) {
        int n = arr.length;
        for (int i = (n/2)-1; i >= 0 ; i--) {
            maxHypify(arr,n,i);
        }
    }

    private void maxHypify(int[] arr, int size, int pos) {
        int largest = pos;
        int left = leftChild(pos);
        int right = rightChild(pos);

        if(left<size && arr[left]>arr[largest]){
            largest = left;
        }
        if(right<size && arr[right]>arr[largest]){
            largest = right;
        }
        if(largest!=pos){
            swap(arr,pos,largest);
            maxHypify(arr,size,largest);
        }
    }

    private int parent(int pos){
        return (pos-1)/2; //(n/2) here n start from 1 not from 0
    }
    private int leftChild(int pos){
        return 2*pos+1; //(2*n)
    }
    private int rightChild(int pos){
        return 2*pos+2; //(2*(n+1))
    }
    private void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int KthSmallestElement(int[] arr,int pos){
        return quickSelect(arr,pos-1,0,arr.length-1);
    }
    /**
     * Performs the QuickSelect algorithm to find the kth smallest element in the array.
     * This method partitions the array around a pivot and recursively selects the kth element.
     *
     * @param arr  The array of integers from which the kth smallest element is to be found.
     * @param pos  The zero-based index of the kth smallest element to find.
     * @param low  The starting index of the subarray to consider.
     * @param high The ending index of the subarray to consider.
     * @return     The value of the kth smallest element if found; otherwise, -1 if the position is invalid.
     */
    public int quickSelect(int[] arr,int pos,int low,int high){
        if(low<=high){
            int pivot = getPivot(arr,low,high);
            if(pivot == pos) return arr[pivot];
            else if(pivot >= pos) return quickSelect(arr,pos,low,pivot-1);
            else return quickSelect(arr,pos,pivot+1,high);
        }
        return -1;
    }
/**
 * Partitions the array around a pivot element and returns the index of the pivot.
 * This method selects the last element as the pivot and rearranges the array such that
 * all elements less than or equal to the pivot are on its left, and all elements greater
 * than the pivot are on its right.
 *
 * @param arr  The array of integers to be partitioned.
 * @param low  The starting index of the subarray to be partitioned.
 * @param high The ending index of the subarray to be partitioned, which is also the pivot.
 * @return     The index of the pivot element after partitioning.
 */
private int getPivot(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
        if (arr[j] <= pivot) {
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return i + 1;
    }
}
