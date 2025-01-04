package Target100In30DaysEnd16JanLeetCode.String;
/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle
 * in haystack, or -1 if needle is not part of haystack*/
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {

//        StringBuilder sb = new StringBuilder(haystack);
//        int index = sb.indexOf(needle);
//        if(index>=0) return index;
//        return -1;

//        for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
//            for (int j = 0; j < needle.length(); j++) {
//                if(haystack.charAt(i+j) != needle.charAt(j)) break;
//                if(j == needle.length()-1) return i;
//            }
//        }
//        return -1;
        for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
            String sub = haystack.substring(i,needle.length()+i);
            if(sub.equals(needle)) return i;
        }
        return -1;

    }
}
