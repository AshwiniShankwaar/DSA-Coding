package Target100In30DaysEnd16JanLeetCode.prefixSum.easy;
/**
 * You are given an integer array nums.
 *
 * Start by selecting a starting position curr such that nums[curr] == 0, and choose a movement direction of either left or right.
 *
 * After that, you repeat the following process:
 *
 * If curr is out of the range [0, n - 1], this process ends.
 * If nums[curr] == 0, move in the current direction by incrementing curr if you are moving right, or decrementing curr if you are moving left.
 * Else if nums[curr] > 0:
 * Decrement nums[curr] by 1.
 * Reverse your movement direction (left becomes right and vice versa).
 * Take a step in your new direction.
 * A selection of the initial position curr and movement direction is considered valid if every element in nums becomes 0 by the end of the process.
 *
 * Return the number of possible valid selections.
 * */
public class MakeArrayElementEqualToZero {
    public int countValidSelections(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                if(simulate(nums,i,1)){
                    count++;
                }
                if(simulate(nums,i,-1)){
                    count++;
                }

            }
        }
        return count;
    }

    private boolean simulate(int[] nums, int i, int d) {


        int[] copy = nums.clone();
        while(i>=0  && i< nums.length){
            if(copy[i] == 0){
                i+=d;
            }else{
                copy[i]--;
                d = -d;
                i +=d;
            }
        }

        for (int j:copy){
            if(j!=0) return false;
        }

        return true;
    }
}
