package LeetCode;
/**
 * Given a fixed-length integer array arr, duplicate each occurrence of zero,
 * shifting the remaining elements to the right.
 * Note: that elements beyond the length of the original array are not written.
 * Do the above modifications to the input array in place and do not return anything.
 *
 * Example 1:
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 *
 * Example 2:
 * Input: arr = [1,2,3]
 * Output: [1,2,3]
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 *
 * Constraints:
 * 1 <= arr.length <= 104
 * 0 <= arr[i] <= 9
 * */
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                for (int j = arr.length-1; j >i; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
                //arr[i] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,0,6,3,4,0,3};
        new DuplicateZeros().duplicateZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
