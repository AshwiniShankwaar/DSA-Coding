package Target100In30DaysEnd16JanLeetCode.HashTable;
import java.util.HashMap;
/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such
 * that they add up to target. You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * You can return the answer in any order.
 * */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length;i++){

            if(map.containsKey(nums[i])){
                res[0] = map.get(nums[i]);
                res[1] = i;
                break;
            }else{
                int dif = target - nums[i];
                map.put(dif,i);
            }
        }
        return res;
    }
}
