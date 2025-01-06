package Target100In30DaysEnd16JanLeetCode.String;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
           StringBuilder sb2 = new StringBuilder(word);
           sb.append(sb2.reverse()+" ");
        }
        return sb.toString().trim();
    }
}
