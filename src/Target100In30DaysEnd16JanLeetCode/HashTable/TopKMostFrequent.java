package Target100In30DaysEnd16JanLeetCode.HashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 * */
public class TopKMostFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> p =
                new PriorityQueue<Map.Entry<Integer,Integer>>(
                        (a,b)->b.getValue()-a.getValue());
        p.addAll(map.entrySet());
        int[] r = new int[k];
        for (int i = 0; i < k; i++) {
            r[i] = p.poll().getKey();
        }
        return r;
    }
}
