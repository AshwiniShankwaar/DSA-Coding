package Target100In30DaysEnd16JanLeetCode.twoPointer.easy;
/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * @Author Ashwini Kumar &lt;<a href="mailto:ashwinishankwaar@gmail.com">
 * */
public class ReverseString {
    public void reverseString(char[] s) {
        int st =0, e = s.length-1;
        while (st < e){
            char temp = s[st];
            s[st] = s[e];
            s[e] = temp;
            st++;
            e--;
        }
    }
}
