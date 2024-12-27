package Target100In30DaysEnd16JanLeetCode;
/**
 * Given two binary strings a and b, return their sum as a binary string.
 * */
public class AddBinary {
    /**
     * this method return a string that will be sum of binary number provider as string
     * @param a,b String that is binary number
     * @return return string that will be sum of binary number provider as string
     * */
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
//        int max = a.length() > b.length() ? a.length() : b.length();
        int max = Math.max(a.length(), b.length());
        for (int i = 0; i < max; i++) {
            int bit1 = i<a.length()?a.charAt(i)-'0':0;
            int bit2 = i<b.length()?b.charAt(i)-'0':0;

            int sum = bit1+bit2+carry;
            sb.append(sum%2);
            carry = sum/2;

        }
        if(carry>0)
        sb.append(carry);
        return sb.reverse().toString();
    }
}
