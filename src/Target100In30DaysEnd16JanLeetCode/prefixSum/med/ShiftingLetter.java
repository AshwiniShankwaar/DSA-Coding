package Target100In30DaysEnd16JanLeetCode.prefixSum.med;
/**
 * You are given a string s of lowercase English letters and an integer array shifts of the same length.
 *
 * Call the shift() of a letter, the next letter in the alphabet, (wrapping around so that 'z'
 * becomes 'a').
 *
 * For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.
 * Now for each shifts[i] = x, we want to shift the first i + 1 letters of s, x times.
 *
 * Return the final string after all such shifts to s are applied.
 * */
public class ShiftingLetter {
    public String shiftingLetters(String s, int[] shifts) {

        char[] str = s.toCharArray();
        int sh = 0;
        for (int i = shifts.length - 1; i >= 0; i--) {
            sh = (sh + shifts[i]) % 26;
            str[i] = shift(str[i], sh);
        }
        return new String(str);

        //my logic

//        int n = shifts.length;
//        int[] sum = new int[n];
//        sum[n-1] = shifts[n-1];
//        for (int i = 0; i < shifts.length; i++) {
//            shifts[i] %= 26;
//        }
//        for (int i = n-2; i >= 0; i--) {
//            sum[i] = shifts[i]+sum[i+1];
//        }
//        StringBuilder sb = new StringBuilder();
//        int i = 0;
//        while (i<s.length()){
//            int x = s.charAt(i)+(sum[i]%26);
//            if(x>'z'){
//                x -='z';
//            }
//            char c = (char) (x<'a'?(x+'a'-1):x);
//            sb.append(c);
//            i++;
//        }
//        return sb.toString();

    }

    private char shift(char c, int sh) {int a = c - 'a';
        a = (a + sh) % 26;
        return (char) (a + 'a');

    }
}
