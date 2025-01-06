package Target100In30DaysEnd16JanLeetCode.HashTable;

import java.util.*;
import java.util.HashMap;

/**
 * Given two arrays of strings list1 and list2, find the common strings with the least index sum.
 *
 * A common string is a string that appeared in both list1 and list2.
 *
 * A common string with the least index sum is a common string such that if it appeared at
 * list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.
 *
 * Return all the common strings with the least index sum. Return the answer in any order.
 * */
public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int min = Integer.MAX_VALUE;
        int i = 0;
        for (String word : list1) {
            map.put(word, i++);
        }
        i = 0;
        Map<String,Integer> list = new HashMap<>();
        for (String word : list2) {
            if(map.containsKey(word)) {
                int sum = map.get(word)+i;
                list.put(word, sum);
                if(sum<min) min = sum;
            }
            i++;
        }
        ArrayList<String> l = new ArrayList<>();
        for(Map.Entry<String,Integer> entry :list.entrySet()){
            if(entry.getValue() == min) l.add(entry.getKey());
        }
        String[] res = l.toArray(new String[l.size()]);
       return res;
    }
}
