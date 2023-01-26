package LeetCode;

import org.w3c.dom.events.Event;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem136 {
    public static void main(String[] args) {
        System.out.println(new Problem136().singleNumber(new int[]{1}));
    }
    public int singleNumber(int[] nums) {
        int n = -1;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
            map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, Integer> new_Map = (Map.Entry<Integer,Integer>) iterator.next();
            if(new_Map.getValue() == 1){
                n = new_Map.getKey();
            }
        }
        return n;
    }
}
