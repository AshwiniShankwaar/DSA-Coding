package GFG;

import java.io.BufferedReader;
import java.io.FileReader;

public class KadanesAlgorithm {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new FileReader("test.txt"));
        String s = bf.readLine();
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
//        System.out.println(maxSubarraySum(arr, arr.length));
        System.out.println(maxSubarraySum(new int[]{-1,-2,-3,-4,-5},5));
    }
    public static long maxSubarraySum(int arr[], int n){
        // Your code here
        long OverAllBest = Integer.MIN_VALUE;
        long CurrentBest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]<arr[i]+CurrentBest){
                CurrentBest+=arr[i];
                if(CurrentBest>OverAllBest){
                    OverAllBest = CurrentBest;
                }
            }else{
                CurrentBest = arr[i];
                if(CurrentBest>OverAllBest){
                    OverAllBest = CurrentBest;
                }
            }
        }
        return OverAllBest;
    }
}
