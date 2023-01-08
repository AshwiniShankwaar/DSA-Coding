package GFG;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConvertToRoman {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("test.txt"));
        int s = Integer.parseInt(bf.readLine());
        System.out.println(convertToRoman(s));
    }
    public static String convertToRoman(int n) {
        //code here
        String out = "";
        while(n>0){
            if(n>=1000){
                out+="m";
                n-=1000;
            } else if (n>=900) {
                out+="cm";
                n-=900;
            }else if (n>=500) {
                out+="d";
                n-=500;
            }else if (n>=400) {
                out+="cd";
                n-=400;
            }else if (n>=100) {
                out+="c";
                n-=100;
            }else if (n>=90) {
                out+="xc";
                n-=90;
            }else if (n>=50) {
                out+="l";
                n-=50;
            }else if (n>=40) {
                out+="xl";
                n-=40;
            }else if (n>=10) {
                out+="x";
                n-=10;
            }else if (n>=9) {
                out+="ix";
                n-=9;
            }else if (n>=5) {
                out+="v";
                n-=5;
            }else if (n>=4) {
                out+="iv";
                n-=4;
            }else if (n>=1) {
                out+="i";
                n-=1;
            }
        }
        return out.toUpperCase();
    }
}
