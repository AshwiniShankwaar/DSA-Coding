package Target100In30DaysEnd16JanLeetCode.HashTable;
import java.util.HashSet;
/**
 * Given a non-empty array of integers nums, every element appears twice except for one.
 * Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num:nums){
            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        Integer[] arr = set.toArray(new Integer[set.size()]);
       return arr[0];
    }
}
