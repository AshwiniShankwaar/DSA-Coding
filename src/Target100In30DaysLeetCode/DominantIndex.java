package Target100In30DaysLeetCode;

/** Question 747
 * You are given an integer array nums where the largest integer is unique.
 *
 * Determine whether the largest element in the array is at least twice as much as every other
 * number in the array. If it is, return the index of the largest element, or return -1 otherwise.
 * */

public class DominantIndex {

    /**
     * @param nums array of integers
     * @return index of the largest element
     * */
    public int dominantIndex(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++){
            if(nums[i]>nums[index]){
                index = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(i!=index && (nums[index]/2)<nums[i]){
                return -1;
            }
        }
        return index;
    }
}
