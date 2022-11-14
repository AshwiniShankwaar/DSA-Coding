package GFG;

import java.util.ArrayList;
import java.util.Collections;

public class Subarraywithgivensum {
    public static void main(String[] args) {
        ArrayList<Integer> out = subarraySum(new int[]{1,2,3,4,5,6,7,8,9,10},10,15);
        for (int i:out) {
            System.out.print(i+" ");
        }
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> elements = new ArrayList<Integer>();
//        boolean [][] dp = new boolean[arr.length+1][s+1];
//
//        for (int i = 0; i < s+1; i++) {
//            dp[0][i] = false;
//        }
//        for (int i = 0; i < arr.length+1; i++) {
//            dp[i][0] = true;
//        }
//        for (int i = 1; i < arr.length+1; i++) {
//            for (int j = 1; j < s+1; j++) {
//                if(arr[i-1]<=j){
//                    dp[i][j] = dp[i-1][j-arr[i-1]]||dp[i-1][j];
//                }else{
//                    dp[i][j] = dp[i-1][j];
//                }
//            }
//        }
//        int i = arr.length;
//        while (s>0){
//            if(dp[i][s] == dp[i-1][s]){
//                i--;
//            }else {
//                s = s -arr[i-1];
//                elements.add(arr[i-1]);
//            }
//        }
//        Collections.reverse(elements);
//        int start = 0;
//        int end = 0 ;
//        for (int j = 0; j < arr.length; j++) {
//            if(arr[j] == elements.get(0)){
//                start = j;
//            }else if(arr[j] == elements.get(elements.size()-1) && j>start){
//                end = j;
//            }
//        }
//        elements.clear();
//        elements.add(start+1);
//        elements.add(end+1);
        int start = 0;
        int end = 0;
        for(int i=0;i< arr.length;i++){
            end = i;
            int temp = s;
            while(temp>0){
                temp-=arr[end];
                end++;
            }
            if(temp == 0) {
                start = i;
                break;
            }
        }
        elements.add(start+1);
        elements.add(end);
        return elements;
    }
}
