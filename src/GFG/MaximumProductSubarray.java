package GFG;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        System.out.println(subarray(5,new int[]{-8,5,3,1,6}));
    }
    public static long subarray(int n,int[] arr){
        long cb = 1;
        long ab = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(cb!=0) {
                cb = cb * arr[i];
                if (cb > ab) {
                    ab = cb;
                }
            }else{
                cb = 1;
                cb = cb * arr[i];
                if (cb > ab) {
                    ab = cb;
                }
            }
        }
        return ab;
    }
}
