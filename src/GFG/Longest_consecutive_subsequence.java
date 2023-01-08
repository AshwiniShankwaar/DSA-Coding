package GFG;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Longest_consecutive_subsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("test.txt"));
        String s = bf.readLine();
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println(findLongestConseqSubseq(arr, arr.length));
        //System.out.println(findLongestConseqSubseq(new int[]{1,11,12,14,9,13,3,10,15,16,17,18,4,20,2},7));
    }
    static int findLongestConseqSubseq(int arr[], int N)
    {
        int min_distance = 0;
        Arrays.sort(arr);
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            set.add(arr[i]);
//        }
//        List<Integer> list = new ArrayList<>(set);
        int distance = 1;
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]!=arr[i-1]){
                if(arr[i]==arr[i-1]+1){
                    distance++;
                }else{
                    min_distance = Math.max(min_distance,distance);
                    distance = 1;
                }
            }
//            if(list.get(i+1) == list.get(i)+1){
//                distance++;
//                continue;
//            }else{
//                if(distance>min_distance){
//                    min_distance = distance+1;
//                }
//                distance = 0;
//            }
        }
        if(min_distance<distance){
            return distance+1;
        }
        return min_distance;
//        int max_distance = 0;
//        Arrays.sort(arr);
//        int start = arr[0];
//        int startIndex = 0;
//        int end = arr[0];
//        int endIndex = 0;
//        for (int i = 0; i < arr.length-1; i++) {
//            if((end+1)==arr[i+1]){
//                end = end+1;
//                endIndex = i+1;
//            }else{
//
//                int distance = 1+endIndex-startIndex;
//                if(max_distance<distance){
//                    max_distance = distance;
//                }
//                start = arr[i+1];
//                startIndex = i+1;
//                end = start;
//                endIndex = startIndex;
//            }
//        }
//        if(max_distance==0){
//            return endIndex-startIndex+1;
//        }
//        return max_distance+1;
    }
}
