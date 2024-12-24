package Target100In30DaysLeetCode;

public class RangeSumQuery_Immutable {
    int[] nums; // -2,-2,1,-4,-2,-3
    public RangeSumQuery_Immutable(int[] nums) { //-2, 0, 3, -5, 2, -1
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i-1]+nums[i];
        }
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int val;
        if(left==0) return nums[right];
        else{
            val = nums[right]-nums[left-1];
        }
        return val;
    }
}
