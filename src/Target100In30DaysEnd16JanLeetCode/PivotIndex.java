package Target100In30DaysEnd16JanLeetCode;

/**
* Question 724  && 1991:
* Given an array of integers nums, calculate the pivot index of this array.
*The pivot index is the index where the sum of all the numbers strictly to the left
* of the index is equal to the sum of all the numbers strictly to the index's right.
*If the index is on the left edge of the array, then the left sum is 0 because there are no
* elements to the left. This also applies to the right edge of the array.Return the leftmost
 * pivot index. If no such index exists, return -1.
* */
public class PivotIndex {

    /**
     * @param nums array of int
     * @return int pivot index
     * */
    public int pivotIndex(int[] nums) {
        int leftsum = 0;
        int total_sum = 0;
        for (int i = 0; i < nums.length;i++){
            total_sum+=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int rightsum = total_sum-leftsum-nums[i];
            if(leftsum==rightsum) return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}
