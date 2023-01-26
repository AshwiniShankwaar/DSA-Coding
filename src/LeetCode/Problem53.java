package LeetCode;

public class Problem53 {
    public static void main(String[] args) {
        System.out.println(new Problem53().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public int maxSubArray(int[] nums) {
        long allTimeBest = Integer.MIN_VALUE;
        long currentBest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] <currentBest+nums[i]){
                currentBest+=nums[i];
                if(allTimeBest <currentBest){
                    allTimeBest = currentBest;
                }
            }else{
                currentBest = nums[i];
                if(allTimeBest <currentBest){
                    allTimeBest = currentBest;
                }
            }
        }
        return (int)allTimeBest;
    }
}
