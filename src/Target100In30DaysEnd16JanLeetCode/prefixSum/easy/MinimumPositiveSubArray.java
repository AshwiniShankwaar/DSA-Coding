package Target100In30DaysEnd16JanLeetCode.prefixSum.easy;

import java.util.List;

/**
 * You are given an integer array nums and two integers l and r. Your task is to find the minimum
 * sum of a subarray whose size is between l and r (inclusive) and whose sum is greater than 0.
 *
 * Return the minimum sum of such a subarray. If no such subarray exists, return -1.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 * */
public class MinimumPositiveSubArray {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int min = Integer.MAX_VALUE;
        boolean found = false;
        //brute force
        for (int i = l; i <=r; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum+=nums.get(j);
            }
            if(sum>0){
                min = Math.min(sum,min);
                found = true;
            }
            for (int j = i; j < nums.size(); j++) {
                sum = sum+nums.get(j)- nums.get(j-i);
                if(sum>0){
                    min = Math.min(sum,min);
                    found = true;
                }
            }

        }

        return found?min:-1;


//        int min = Integer.MAX_VALUE;
//        int index = -1;
//        //3,-2,1,4   2,3   -2,2,-3,1
//        //3,1,-1,5          -2,0,-3,-2
//        int[] arr = new int[nums.size()];
//        arr[0] = nums.getFirst();
//        for (int i = 1; i < nums.size(); i++) {
//            arr[i]=arr[i-1]+nums.get(i);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>0 && arr[i]<min) {
//                min = arr[i];
//                index = i;
//            }
//        }
//        //check for the left side of the smallest nbr
//        if(min == Integer.MAX_VALUE) return -1;
//       int min_copy = min;
//        int i = index;
//        while(i>=0){
//            int size = index-i+1;
//            if(size>=l && size<=r){
//                return min_copy;
//            }
//            min_copy = min_copy-nums.get(i);
//            i--;
//        }
//        return -1;

    }
}
