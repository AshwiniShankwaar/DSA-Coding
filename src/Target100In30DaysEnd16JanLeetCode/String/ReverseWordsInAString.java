package Target100In30DaysEnd16JanLeetCode.String;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i >0; i--) {
            if(words[i].equals("")) continue;
            sb.append(words[i]+" ");
        }
        sb.append(words[0]);
        return sb.toString();
    }

}
