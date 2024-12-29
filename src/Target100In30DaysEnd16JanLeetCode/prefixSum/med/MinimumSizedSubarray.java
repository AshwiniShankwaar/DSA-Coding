package Target100In30DaysEnd16JanLeetCode.prefixSum.med;
/**
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a
 * subarray
 *  whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 * */
public class MinimumSizedSubarray {
    public int minSubArrayLen(int target, int[] nums) {

        //optimised using sliding window
        int min = Integer.MAX_VALUE;
        int left = 0;
        int sum=0;
        for (int i = 0; i < nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                min = Math.min(min,i-left+1);
                sum-=nums[left];
                left++;
            }

        }
        return min==Integer.MAX_VALUE?0:min;


//        //bruteforce
//        int min = nums.length;
//        boolean found = false;
//        for (int i = 0; i < nums.length;i++){
//            int sum = nums[i];
//            if(sum>=target){
//                min = 1;
//                found = true;
//            }
//            for (int j = i+1; j < nums.length ; j++) {
//                sum+=nums[j];
//                int size = j-i+1;
//                if(sum>=target && size<=min){
//                    min = size;
//                    found = true;
//                }
//            }
//        }
//        return found?min:0;
      //  below solution is good for if it is asked for subarray of target k
//        int i = 0,j = 0;
//        int sum = nums[j];
//        int min_size = 0;
//        while (j<= nums.length-1){
//            if(sum<target){
//                j++;
//                if(j< nums.length)sum+=nums[j];
//
//            }else if(sum>target){
//                sum-=nums[i];
//                i++;
//            }else{
//                min_size = j-i+1;
//                j++;
//                if(j< nums.length)sum+=nums[j];
//            }
//        }
//        return min_size;
    }
}
