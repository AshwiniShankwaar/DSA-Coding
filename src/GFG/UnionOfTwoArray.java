package GFG;

import java.io.*;
import java.util.*;

public class UnionOfTwoArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("fileInput.txt"));
        String s = bf.readLine();
        String[] str = s.split(" ");
        int[] a = new int[str.length];
        int i =0;
        for (String string: str) {
            a[i] = Integer.parseInt(string);
            i++;
        }
        s = bf.readLine();
        str = s.split(" ");
        int[] b = new int[str.length];
        i =0;
        for (String string: str) {
            b[i] = Integer.parseInt(string);
            i++;
        }
        int out = doUnion(a,a.length,b,b.length);
        System.out.println(out);
    }
    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here
        HashSet<Integer> list =  new HashSet<>();
//        if(n>m){
//            for(int i:a){
//                list.add(i);
//            }
//            for(int i = 0;i<b.length;i++){
//                if(!list.contains(b[i])){
//                    list.add(b[i]);
//                }
//            }
//        }else{
//            for(int i:b){
//                list.add(i);
//            }
//            for(int i = 0;i<a.length;i++){
//                if(!list.contains(a[i])){
//                    list.add(a[i]);
//                }
//            }
//        }
        int min = m>n?n:m;
        for (int i = 0; i < min; i++) {
            list.add(a[i]);
            list.add(b[i]);
        }
        if(m>n){
            for (int i = n; i < m; i++) {
                list.add(b[i]);
            }
        }else{
            for (int i = m; i < n; i++) {
                list.add(a[i]);
            }
        }//time complexity is O((n+m)log(n+m))
        return list.size();
    }
}
