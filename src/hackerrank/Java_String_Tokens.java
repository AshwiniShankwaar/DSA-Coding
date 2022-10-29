package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_String_Tokens {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
//        a = a.replaceAll("[,!?._@]","");
//        String[] y = a.split("[ ']" );
//        int count = 0;
//        for (String p:y) {
//            if(p.equals("")) count++;
//        }
//        System.out.println(y.length-count);
//        for (int i = 0;i<y.length;i++) {
//            if(y[i].equals("")) continue;
//            System.out.println(y[i]);
//        }
        String[] b = a.trim().split("[ !,?._'@]+");

        if(a.trim().isEmpty()){
            System.out.println("0");
        }
        else {
            System.out.println(b.length);
            for (String k : b) {
                System.out.println(k);
            }
        }
    }

}
