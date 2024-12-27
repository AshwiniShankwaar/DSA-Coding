package Target100In30DaysEnd16JanLeetCode;
/**
 * Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
 *
 * answer.length == nums.length.
 * answer[i] = |leftSum[i] - rightSum[i]|.
 * Where:
 *
 * leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no
 * such element, leftSum[i] = 0.
 * rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is
 * no such element, rightSum[i] = 0.
 * Return the array answer.
 * */
public class LeftAndRightSumDifference {
    public int[] leftRightDifference(int[] nums) {
        //10,4,8,3   =>   10, 14, 22, 25
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if(i==0){
                nums[i] = prefixSum[nums.length-1]-prefixSum[i];
            }
            else if(i == nums.length-1){
                nums[i] = prefixSum[i-1];
            }else {
                int left = prefixSum[i - 1];
                int right = prefixSum[nums.length-1]-prefixSum[i];
                nums[i] = Math.abs(left-right);
            }
        }
        return nums;
    }
}
