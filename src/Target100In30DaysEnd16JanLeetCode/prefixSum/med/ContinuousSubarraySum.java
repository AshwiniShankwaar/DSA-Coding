package Target100In30DaysEnd16JanLeetCode.prefixSum.med;

import java.util.HashMap;

/**
 * Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.
 *
 * A good subarray is a subarray where:
 *
 * its length is at least two, and
 * the sum of the elements of the subarray is a multiple of k.
 * Note that:
 *
 * A subarray is a contiguous part of the array.
 * An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a
 * multiple of k.
 * */
public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length<2) return false;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){

            sum += nums[i];
            int rem = sum%k;
            if(map.containsKey(rem)) {
                if (i - map.get(rem) > 1)
                    return true;
            }else {
                map.put(rem, i);
            }
        }
        return false;
    }
}
