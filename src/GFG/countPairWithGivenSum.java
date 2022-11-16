package GFG;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class countPairWithGivenSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("test.txt"));
        String[] data = bf.readLine().split(" ");
        int[] num = new int[data.length];
        int i = 0;
        for (String s: data) {
            num[i] = Integer.parseInt(s);
            i++;
        }
        System.out.println(getPairsCount(num, num.length, 2));
    }
    public static int getPairsCount(int[] arr, int n, int k) {
        // code here
//        int out = 0;
//        int[][] dp = new int[n+1][k+1];
//        for (int i = 0; i < k+1; i++) {
//            dp[0][i] = 0;
//        }
//        for (int i = 0; i < n+1; i++) {
//            dp[i][0] = 1;
//        }
//        for (int i = 1; i < n+1; i++) {
//            for (int j = 1; j < k+1; j++) {
//                if(arr[i-1]>j){
//                    dp[i][j] = dp[i-1][j];
//                }else{
//                    dp[i][j] = dp[i-1][j]+dp[i-1][j-arr[i-1]];
//                }
//            }
//        }
//        out= dp[n][k];
//        int out = 0;
//        if(k==0){
//            out=1;
//        }
//        int left = out+getPairsCount(arr, n-1, k);
//        int right = out+getPairsCount(arr,n-1,k-arr[n]);
//        out = left+right;
//        HashMap<Integer,Integer> fre = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            Integer j = fre.get(arr[i]);
//            fre.put(arr[i], (j == null) ? 1 : j + 1);
//        }
//        int answer =0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == k - arr[i])
//            {
//                answer += (fre.get(arr[i]) - 1);
//            }
//            else
//            {
//                Integer j = fre.get(k - arr[i]);
//                if(j!=null)
//                    answer += j;
//            }
//        }
//        return answer/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        int answer = 0;
//        for (int i = 0; i < n; i++) {
//            Integer j = map.get(arr[i]);
//            map.put(arr[i], (j == null) ? 1 : j + 1);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            int diff = k-arr[i];
//            if(map.containsKey(diff)){
//                answer+=map.get(diff);
//                map.put(arr[i], map.get(arr[i])+1 );
//            }
//            map.put(arr[i], 1);
//        }
        return answer;
    }
}
