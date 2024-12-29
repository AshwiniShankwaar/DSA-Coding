package Target100In30DaysEnd16JanLeetCode.prefixSum.easy;
/**
 * Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.
 *
 * A subarray is a contiguous subsequence of the array.
 * */
public class SumOfAllOddLengthSubarray {
    public int sumOddLengthSubarrays(int[] arr) {
        //1,4,2,5,3 => 1,5,7,12,15
        // optimised solution
        int n = arr.length;
        int sum = 0;

        /**
         * i+1: The number of ways to start a subarray that includes the element at index i.
         * n-i: The number of ways to end a subarray that includes the element at index i.
         * Therefore, (i+1) * (n-i) gives the total number of subarrays that include the element arr[i].
         * */

        for(int i = 0; i<arr.length; i++){
            sum +=(((i+1)*(n-i)+1)/2)*arr[i];
        }
        return sum;

//        int size = 1;
//        int sum = 0;
//        int[] prefixSum = new int[arr.length];
//        prefixSum[0] = arr[0];
//        for (int i = 1; i < arr.length; i++){
//            prefixSum[i] = prefixSum[i-1]+arr[i];
//        }
//        while(size<=arr.length) {
//            if(size ==1){
//                sum+=prefixSum[arr.length-1];
//            }else {
//                sum+=prefixSum[0+size-1];
//                for (int i = 1; i <= arr.length-size; i++) {
//                    sum+=prefixSum[i+size-1]-prefixSum[i-1];
//                }
//            }
//            size +=2;
//        }
//        return sum;
    }
}
