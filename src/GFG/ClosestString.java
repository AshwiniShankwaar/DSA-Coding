package GFG;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ClosestString {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("test.txt"));
        String s = bf.readLine();
        String[] str = s.split(" ");
        ArrayList<String> arr = new ArrayList<>();
        for (String st:str) {
            arr.add(st);
        }
//        arr.add("the");
//        arr.add("quick");
//        arr.add("browns");
//        arr.add("fox");
//        arr.add("quick");
        System.out.println(shortestDistance(arr,"kym","gdf"));
    }
    private static int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
       int distance = Integer.MAX_VALUE;
       if(word1.equals(word2)) return 0;
//       int[][] d = new int[s.size()][s.size()];
       for (int i = 0; i < s.size(); i++) {
           if(s.get(i).equals(word1)||s.get(i).equals(word2)){
               for (int j = 0; j < s.size(); j++) {
                   if(s.get(j).equals(word1)||s.get(j).equals(word2)){
                       if(s.get(i).equals(s.get(j))){
//                           d[i][j] = Integer.MAX_VALUE;
                           continue;
                       }else{
                           if(j>i){
//                               d[i][j]=j-i;
                               int res = j-i;
                               if(res<distance){
                                   distance=res;
                               }
                           }else{
//                               d[i][j]=i-j;
                               int res = i-j;
                               if(res<distance){
                                   distance=res;
                               }
                           }
                       }
                   }
//                   else{
//                       d[i][j] = Integer.MAX_VALUE;
//                   }
               }
           }
           //else{
//               for (int j = 0; j < d[i].length; j++) {
//                   d[i][j] = Integer.MAX_VALUE;
//               }
//           }
       }
       return distance;
    }
}
