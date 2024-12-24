package Target100In30DaysLeetCode;

import java.util.PriorityQueue;

/**
 * Question 215
 *
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 *
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 * Can you solve it without sorting?
 * */
public class KthLargestElementOfArray {

    public int findKthLargest(int[] nums, int k) {
//        int key = quickSelect(nums,nums.length-k,0, nums.length-1);
//        return nums[key];
        //going for mean heap

//        buildHeap(nums);
//        int kthvalue = -1;
//        int heapsize = nums.length;
//        for (int i = 0; i < k; i++) {
//            try{
//                kthvalue = extractKthMinValue(nums,heapsize--);
//            } catch (IllegalArgumentException e) {
//                throw new IllegalArgumentException(e);
//            }
//        }
//        return nums[kthvalue];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num:nums){
            minHeap.offer(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    private int extractKthMinValue(int[] nums, int i) {
        if(i<=0) throw new IllegalArgumentException("minheap overflow");
        int min = nums[0];
        nums[0] = nums[i-1];
        minHeapify(nums,i,0);
        return min;
    }

    private void buildHeap(int[] nums){
        int size = nums.length;
        for(int i = (size/2)-1; i >=0; i--){
            minHeapify(nums,size,i);
        }
    }

    private void minHeapify(int[] nums, int size, int pos) {
        int smallest = pos;
        int leftChild = leftChild(pos);
        int rightChild = rightChild(pos);
        if(leftChild<smallest){
            smallest = leftChild;
        }
        if(rightChild<smallest){
            smallest = rightChild;
        }
        if(smallest!=pos){
            swap(nums,smallest,pos);
            minHeapify(nums,size,smallest);
        }
    }

    private int leftChild(int pos){
        return 2*pos+1;
    }
    private int rightChild(int pos){
        return 2*pos+2;
    }
    public int quickSelect(int[] arr,int k,int low,int high){
        if(low<=high){
            int pivot = getPivot(arr,low,high);
            if(pivot == k){
                return pivot;
            }else if(k<pivot){
                return quickSelect(arr,k,low,pivot-1);
            }else{
                return quickSelect(arr,k,pivot+1,high);
            }
        }
        return -1;
    }

    private int getPivot(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j = low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
