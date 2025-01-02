package Target100In30DaysEnd16JanLeetCode.prefixSum.med;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a binary array nums, return the maximum length of a contiguous subarray with
 * an equal number of 0 and 1.
 * */
public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int sum = 0 ;
        int maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i< nums.length;i++){
            if(nums[i] == 0){
                sum = sum-1;
            }else{
                sum=nums[i]+sum;
            }
            if(sum == 0){
               maxLength = i+1;
            } else if (map.containsKey(sum)) {
                int size = i - map.get(sum);
                if(size > maxLength){
                    maxLength = size;
                }
            } else{
                map.put(sum,i);
            }
        }

        return maxLength;
    }
}
