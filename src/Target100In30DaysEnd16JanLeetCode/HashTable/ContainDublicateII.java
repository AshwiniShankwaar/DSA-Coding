package Target100In30DaysEnd16JanLeetCode.HashTable;

import java.util.HashMap;

/**
 * Given an integer array nums and an integer k, return true if there are two distinct indices
 * i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 * */
public class ContainDublicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        for(int num:nums){
            if (map.containsKey(num)){
                if((i-map.get(num))<=k) return true;
                else map.put(num,i);
            }else{
                map.put(num,i);
            }
            i++;
        }
        return false;
    }
}
