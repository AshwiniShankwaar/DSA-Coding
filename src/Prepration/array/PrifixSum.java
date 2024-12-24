package Prepration.array;

public class PrifixSum {
    public static void main(String[] args) {
        int i = new PrifixSum()
                .prefixSumPattern(new int[]{3,5,4,2,7,9},1,4);
        System.out.println(i);
    }
    public int prefixSumPattern(int[] arr,int i,int j){
        for (int k = 1; k < arr.length; k++) {
            arr[k] = arr[k]+arr[k-1];
        }
        return arr[j] - arr[i-1];
    }
}
