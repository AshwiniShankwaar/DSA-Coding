package Target100In30DaysEnd16JanLeetCode.String;

import java.util.Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 * */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
//        int size = Integer.MAX_VALUE;
//        for (int i = 0; i < strs.length; i++) {
//            if(strs[i].length()<size){
//                size = strs[i].length();
//            }
//        }
        if(strs.length == 0|| strs == null ) return "";
        String prefix = strs[0];
        for(int i = 1; i < strs.length;i++){
            while(strs[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
