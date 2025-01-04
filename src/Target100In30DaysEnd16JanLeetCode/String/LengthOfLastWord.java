package Target100In30DaysEnd16JanLeetCode.String;
/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 *
 * A word is a maximal
 * substring
 *  consisting of non-space characters only.
 * */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
//        String[] words = s.trim().split(" ");
//        return words[words.length-1].length();
        char[] chars = s.trim().toCharArray();
        int i = chars.length-1;
        while(i>=0 && chars[i]!=' '){
            i--;
        }
        return chars.length-1-i;
    }
}
