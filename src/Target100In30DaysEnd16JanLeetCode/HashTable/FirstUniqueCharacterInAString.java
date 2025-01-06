package Target100In30DaysEnd16JanLeetCode.HashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0;i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }else
                map.put(s.charAt(i),1);

        }

//        HashSet<Character> set = new HashSet<Character>();
////        int min = Integer.MAX_VALUE;
//        for(Map.Entry<Character,Integer> e:map.entrySet()){
//            if(e.getValue() ==1) set.add(e.getKey());
//        }
//        if(set.size() == 0) return -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
//            if(set.contains(c)) return i;
            if(map.get(c) == 1) return i;
        }
        return -1;
    }
}
