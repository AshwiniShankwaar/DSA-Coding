package extra;

import java.util.Scanner;

public class teju {
    public static int count(int n){
        int out=0;
        if (n<100){
            return 9;
        }
        out=9;
        for (int i = n; i >99 ; i--) {
            int digit = (int)Math.floor(Math.log10(i) + 1);
            if(digit%2!=0){
                out+=1;
            }
        }
        return out;
    }
    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int out=0;
        if (n<100){
            System.out.println(9);
        }
        out=9;
        for (int i = n; i >99 ; i--) {
            int digit = (int)Math.floor(Math.log10(i) + 1);
            if(digit%2!=0){
                out+=1;
            }
        }
        System.out.println(out);
    }
}
