package Target100In30DaysEnd16JanLeetCode.prefixSum.med;

import java.util.HashMap;

/**
 * Question 560
 * Given an array of integers nums and an integer k, return the total number of subarrays
 * whose sum equals to k.
 * A subarray is a contiguous non-empty sequence of elements within an array.
 * */
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,1);
        for (int num:nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
