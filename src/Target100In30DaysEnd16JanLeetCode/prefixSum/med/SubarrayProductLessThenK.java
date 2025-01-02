package Target100In30DaysEnd16JanLeetCode.prefixSum.med;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer k, return the number of contiguous
 * subarrays where the product of all the elements in the subarray is strictly less than k.
 *
 * Example 1:
 *
 * Input: nums = [10,5,2,6], k = 100
 * Output: 8
 * Explanation: The 8 subarrays that have product less than 100 are:
 * [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
 * Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
 * Example 2:
 *
 * Input: nums = [1,2,3], k = 0
 * Output: 0
 * */
public class SubarrayProductLessThenK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        //optimised version
        int count = 0;
        int product = 1;
        int start = 0;
        int end = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        while(end<nums.length){
            product*=nums[end++];
            while(start<end && product>=k){
                product /= nums[start++];
            }
            if(product<k){
                count+=end-start;
            }

        }
        //int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int product =nums[i];
//            if(product<k) count++;
//            else continue;
//            for (int j = i+1; j < nums.length; j++) {
//                product*=nums[j];
//                if(product<k) count++;
//                else break;
//            }
//        }
        return count;
    }
}
