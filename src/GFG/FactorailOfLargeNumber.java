package GFG;

import java.util.ArrayList;
import java.util.Collections;

public class FactorailOfLargeNumber {
    public static void main(String[] args) {
        ArrayList<Integer> out = factorial(100);
        String s = "";
        for (Integer x: out) {
            s=s+x;
        }
        System.out.println(s);
    }
    public static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(N==0){
            arr.add(0);
            return arr;
        }
        arr.add(1);
        int i = 2;
        while(i<=N){
            arr = multiply(i,arr);
            i++;
        }
        return arr;
    }

    private static ArrayList<Integer> multiply(int i, ArrayList<Integer> arr) {
        int carry = 0;
        ArrayList<Integer> out = new ArrayList<Integer>();
        for (int j = arr.size()-1; j >=0; j--) {
            int x = i*arr.get(j)+carry;
            int rem = x%10;
            out.add(rem);
            carry = x/10;
        }
        if(carry!=0){
            while (carry>0){
                int x = carry%10;
                out.add(x);
                carry = carry/10;
            }
        }
        Collections.reverse(out);
        return out;
    }
}
