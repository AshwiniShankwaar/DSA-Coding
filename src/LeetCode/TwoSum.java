package LeetCode;

import java.util.ArrayList;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        int[] ans = t.twoSum(new int[]{3,3},6);
        for (int a: ans) {
            System.out.print(a+" ");
        }
    }
    public int[] twoSum(int[] nums, int target) {
        //continuous targeted sum in an array
//        ArrayList<Integer> arr = new ArrayList<>();
//        int s=0;
//        int e=0;
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum+=nums[i];
//            e = i;
//            if(sum>target){
//                s+=1;
//                sum-=nums[s-1];
//            }
//            if(sum == target){
//                break;
//            }
//        }
//        for (int i = s; i < e+1; i++) {
//            arr.add(i);
//        }
//        nums = new int[arr.size()];
//        for (int i = 0; i < arr.size(); i++) {
//            nums[i] = arr.get(i);
//        }
//        return nums;
        class xyz{
            public int[] Sum(int[] nums, int target) {
                int[] x = new int[2];
                for (int i = 0; i < nums.length; i++) {
                    for (int j = i+1; j < nums.length; j++) {
                        if(nums[i]+nums[j] == target){
                            x[0] = i;
                            x[1] = j;
                        }
                    }
                }
                return x;
            }
        }
        xyz x = new xyz();
        int[] o = x.Sum(nums,target);
        return o;
    }
}
