package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Java_Anagrams {
    public static boolean Anagrams(String a,String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        if(x.length !=y.length) return false;
        for (int i = 0; i < x.length; i++) {
            if(x[i] != y[i]) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String a = new Scanner(System.in).next();
        String b = new Scanner(System.in).next();
        if(!Anagrams(a,b)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}
