package Target100In30DaysEnd16JanLeetCode.HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *Given a string s, find the length of the longest substring without repeating characters.
 * */
public class LongestSubstringWithoutRepetation {
    public int lengthOfLongestSubstring(String s) {

        //optimised
        int maxLength = 0;
        int[] charArray = new int[128];
        int leftPointer = 0;
        Arrays.fill(charArray, -1);

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            if (charArray[s.charAt(rightPointer)] >= leftPointer) {
                leftPointer = charArray[s.charAt(rightPointer)] + 1;
            }
            charArray[s.charAt(rightPointer)] = rightPointer;
            maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
        }

        return maxLength;

        //my logic

//        if(s.isEmpty()) return 0;
//        List<Character> list = new ArrayList<>();
//        int i=0;
//        int j=0;
//        int max = 0;
//        while(j<s.length() && i<=j){
//            char c = s.charAt(j);
//            if(list.contains(c)){
//                int l = j-1-i;
//                max = Math.max(max,l);
//                list.remove(0);
//                i++;
//            }else{
//                list.add(c);
//                j++;
//            }
//        }
//        int l = j-1-i;
//        max = Math.max(max,l);
//        return max+1;
    }
}
