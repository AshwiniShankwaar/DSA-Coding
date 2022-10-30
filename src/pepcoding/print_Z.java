package pepcoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class print_Z {
    public static void main(String[] args) throws IOException {
        //print z of n = 5
//        * * * * *
//              *
//            *
//          *
//        * * * * *
        //with the given provided input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
//        System.out.println(n);
        for (int i = 0; i < n; i++) {
            if(i == 0||i==n-1){
                for (int j = 0; j <n ; j++) {
                    System.out.print("* ");
                }

            }
            else{
                for (int j = 0; j < n-1-i; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
                for (int j = n-1; j < n; j++) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
