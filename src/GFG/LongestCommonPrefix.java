package GFG;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("test.txt"));
        String s = bf.readLine();
        String[] str = s.split(" ");

        System.out.println(longestCommonPrefix(str, str.length));
    }
    public static String longestCommonPrefix(String arr[], int n){
        // code here
        Arrays.sort(arr);
        if(arr[0].length()<arr[n-1].length()){
            return compare(arr[0],arr[n-1]);
        }else{
            return compare(arr[n-1],arr[0]);
        }
    }
    public static String compare(String s1, String s2){
        String output="";
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                output = output+s1.charAt(i);
                continue;
            }else{
                break;
            }
        }
        if(output==""){
            return "-1";
        }
        return output;
    }
}
