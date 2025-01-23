package Target100In30DaysEnd16JanLeetCode.String;
/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        s = s.toLowerCase();
        int st = 0;
        int end = s.length() - 1;

        while (st < end) {
            // Skip non-alphanumeric characters
            while (st < end && !Character.isLetterOrDigit(s.charAt(st))) st++;
            while (st < end && !Character.isLetterOrDigit(s.charAt(end))) end--;

            // Compare the characters
            if (s.charAt(st) != s.charAt(end)) return false;

            st++;
            end--;
        }

        return true;
    }

}
