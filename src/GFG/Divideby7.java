package GFG;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Divideby7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("test.txt"));
        String s = bf.readLine();
        System.out.println(isDivisibleBy7(s));
    }
    public static int isDivisibleBy7(String str){
        int out = 0;
        ArrayList<Integer> s = new ArrayList<>();
        if(str.length()%3==1){
            str = "00"+str;
        }else if(str.length()%3==2){
            str = "0"+str;
        }
        int start = 0;
        while (start+3<=str.length()){
            String data = str.substring(start,start+3);
            start = start+3;
            s.add(Integer.parseInt(data));
        }
        int res = 0;
        for (int i = s.size()-1; i >=0; i--) {
            if(i%2!=0){
                res+=s.get(i);
            }else{
                res-=s.get(i);
            }
        }
        if(res%7==0){
            return 1;
        }
        return out;
    }
}
