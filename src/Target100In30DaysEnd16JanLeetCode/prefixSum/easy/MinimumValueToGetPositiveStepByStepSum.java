package Target100In30DaysEnd16JanLeetCode.prefixSum.easy;
/**
 * Given an array of integers nums, you start with an initial positive value startValue.
 *
 * In each iteration, you calculate the step by step sum of startValue plus elements in
 * nums (from left to right).
 *
 * Return the minimum positive value of startValue such that the step by step sum is never
 * less than 1.
 * */
public class MinimumValueToGetPositiveStepByStepSum {
    public int minStartValue(int[] nums) {
        int min = nums[0];
        for(int i = 1;i< nums.length;i++){
            nums[i] = nums[i]+nums[i-1];
            if(nums[i]<min)min = nums[i];
        }

        return (min<0)? Math.abs(min)+1:1;
    }
}
