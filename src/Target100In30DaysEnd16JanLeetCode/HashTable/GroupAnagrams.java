package Target100In30DaysEnd16JanLeetCode.HashTable;

import java.util.*;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 *Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        //optimised
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            map.putIfAbsent(new String(ch),new ArrayList<String>());
            map.get(new String(ch)).add(str);
        }

        return new ArrayList<>(map.values());

//        HashMap<String,List<String>> map = new HashMap<>();
//        //Arrays.sort(strs);
//        for (String str : strs) {
//            int[] c = new int[26];
//            for(char ct:str.toCharArray()){
//                int index = ct-'a';
//                c[index]+=1;
//            }
//
//            String key = Arrays.toString(c);
//
//            if(map.containsKey(key)){
//                map.get(key).add(str);
//            }else {
//                List<String> l = new ArrayList<>();
//                l.add(str);
//                map.put(key,l);
//            }
//        }
////        map.entrySet().stream().sorted(
////                (e1,e2) ->
////                        Integer.compare(e1.getValue().size(),e2.getValue().size()));
//        map.values().forEach(Collections::sort);
////        return new ArrayList<>(map.values());
//        return new ArrayList<>(
//                map.values().stream().sorted(
//                        (p1, p2) -> {
//                            if(p1.size()<p2.size()) return -1;
//                            else if (p1.size()>p2.size()) return 1;
//                            else return 0;
//
//
//                        }
//                        ).collect(Collectors.toList()));
    }
}
