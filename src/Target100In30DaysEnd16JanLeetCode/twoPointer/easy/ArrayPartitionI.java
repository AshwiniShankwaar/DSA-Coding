package Target100In30DaysEnd16JanLeetCode.twoPointer.easy;



/**
 * Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2),
 * ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
 * */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {


        //approch sort-> pair -> find min-> sum
        mergesort(nums);
        int sum = 0;
        for(int i = 0;i<nums.length-1;i+=2){
            int min = Math.min(nums[i],nums[i+1]);
            sum += min;
        }
        return sum;
    }
    public void mergesort(int[] nums) {
       int n= nums.length;
       if(n<2) return;
       int mid = (0+n)/2;
       int[] left = new int[mid];
       int[] right = new int[n-mid];

       for(int i=0; i<mid; i++) {
           left[i] = nums[i];
       }
       for (int i = mid; i < n; i++) {
            right[i-mid] = nums[i];
       }
       mergesort(left);
       mergesort(right);
       merge(left, right,nums);

    }
    public void merge(int[] left, int[] right, int[] arr){
        int nl = left.length;
        int nr = right.length;
        int i,j,k;
        i = 0;j=0;k=0;
        while(i<nl && j<nr){
            if(left[i]<=right[j]){
                arr[k] = left[i++];
            }else{
                arr[k] = right[j++];
            }
            k++;
        }
        while(i<nl){
            arr[k++] = left[i++];
        }
        while (j<nr){
            arr[k++] = right[j++];
        }

    }

}
