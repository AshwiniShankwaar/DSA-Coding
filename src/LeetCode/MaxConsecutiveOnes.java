package LeetCode;
/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 *
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 * */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOccurance=0;
        int occurance = 0;
        for (int i=0; i<nums.length; i++) {
            if(nums[i]==1){
                occurance=occurance+1;
            }else{
                if(occurance>maxOccurance){
                    maxOccurance = occurance;
                    occurance = 0;
                }else{
                    occurance = 0;
                }
            }
        }

        return occurance>maxOccurance?occurance:maxOccurance;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(new MaxConsecutiveOnes().findMaxConsecutiveOnes(nums));
    }
}
