package GFG;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RomanNumberToInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("test.txt"));
        String s = bf.readLine();
        //String[] str = s.split(" ");

        System.out.println(romanToDecimal(s));
    }
    public static int getValue(char c){
        if(c == 'i'){
            return 1;
        }else if(c == 'v'){
            return 5;
        }else if(c == 'x'){
            return 10;
        }else if(c == 'l'){
            return 50;
        }else if(c == 'c'){
            return 100;
        }else if(c == 'd'){
            return 500;
        }else if(c == 'm'){
            return 1000;
        }
        return -1;
    }
    public static int romanToDecimal(String str) {
        // code here
        str = str.toLowerCase();
        int out = 0;
        for (int i = 0; i < str.length(); i++) {
            int s1 = getValue(str.charAt(i));
            if(i+1<str.length()){
                int s2 = getValue(str.charAt(i+1));
                if(s1>=s2){
                    out = out+s1;
                }else{
                    out = out+s2-s1;
                    i=i+1;
                }
            }else{
                out = out+s1;
            }

        }
        return out;
    }
}
