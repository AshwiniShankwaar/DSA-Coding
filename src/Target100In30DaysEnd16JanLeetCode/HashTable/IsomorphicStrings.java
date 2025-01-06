package Target100In30DaysEnd16JanLeetCode.HashTable;

import java.util.HashMap;

/**
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving
 * the order of characters. No two characters may map to the same character, but a character
 * may map to itself.
 * */
public class IsomorphicStrings {
//    HashMap<Character,Character> map = new HashMap<Character,Character>();
//    public IsomorphicStrings(){
//        for(char i = 'a';i<= 'z';i++){
//            map.put(i,' ');
//        }
//    }
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> smap = new HashMap<Character,Character>();
        HashMap<Character,Character> tmap = new HashMap<Character,Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char x = t.charAt(i);
            if(smap.containsKey(c) ) {
                if(smap.get(c) != x)return false;
            }
            else{
                smap.put(c, x);
            }
            if(tmap.containsKey(x) ) {
                if(tmap.get(x) != c)return false;
            }
            else{
                tmap.put(x, c);
            }
        }
        return true;
    }
}
