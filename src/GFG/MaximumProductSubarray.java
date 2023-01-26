package GFG;


import static java.lang.Math.max;
import static java.lang.Math.min;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        System.out.println(subarray(5,new int[]{6,-3,-10,0,2}));
    }
    public static long subarray(int n,int[] arr){
        long OverAllBest = 0;
        long mini=arr[0];
        long maxi=arr[0];

        OverAllBest=maxi;
        for (int i = 1; i < n; i++) {
            long choise1 = mini*arr[i];
            long choise2 = maxi*arr[i];
//            maxi = max(max(choise1,choise2),arr[i]);
//            mini = min(min(choise1,choise2),arr[i]);
            if(choise1>choise2){
                if(choise1>arr[i]){
                    maxi = choise1;
                }else{
                    maxi = arr[i];
                }
            }else if(choise1<choise2){
                if(choise2>arr[i]){
                    maxi = choise2;
                }else{
                    maxi = arr[i];
                }
            }else{
                if(choise1>arr[i]){
                    maxi = choise1;
                }else{
                    maxi = arr[i];
                }
            }
            if(choise1<choise2){
                if(choise1<arr[i]){
                    mini = choise1;
                }else{
                    mini = arr[i];
                }
            }else if(choise1>choise2){
                if(choise2<arr[i]){
                    mini = choise2;
                }else{
                    mini = arr[i];
                }
            }else{
                if(choise1<arr[i]){
                    mini = choise1;
                }else{
                    mini = arr[i];
                }
            }
            if(maxi>OverAllBest){
                OverAllBest = maxi;
            }
        }
        return OverAllBest;
    }
}
