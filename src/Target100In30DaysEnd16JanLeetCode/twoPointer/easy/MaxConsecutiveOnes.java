package Target100In30DaysEnd16JanLeetCode.twoPointer.easy;
/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 * */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max=0;
        int ou=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                ou+=1;
            }else{
                if(ou>max){
                    max=ou;
                    ou=0;
                }else{
                    ou=0;
                }
            }
        }
        return ou>max?ou:max;
//        int max = 0;
//        for(int i=1;i<nums.length;i++){
//            if(nums[i]==0 && max<nums[i-1]){
//                max = nums[i-1];
//            }else{
//                nums[i] = nums[i]+nums[i-1];
//            }
//        }
//        if(max<nums[nums.length-1]) max = nums[nums.length-1];
//        return max;
    }
}
