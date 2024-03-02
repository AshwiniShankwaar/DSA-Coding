package LeetCode;
/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums is sorted in non-decreasing order.*/
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {

        squareNumber(nums);
        mergeSort(nums);
        return nums;
    }

    private void squareNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }
    }

    public void mergeSort(int[] nums){
        int n = nums.length;
        if(n<2) return;
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }
        for (int i = mid; i < n; i++) {
            right[i-mid] = nums[i];
        }
        mergeSort(left);
        mergeSort(right);
        sort(left,right,nums);
    }

    private void sort(int[] left, int[] right, int[] nums) {
        int nl = left.length;
        int nr = right.length;
        int i,j,k;
        i=j=k=0;
        while (i<nl && j< nr){
            if(left[i]<right[j]){
                nums[k] = left[i];
                i++;
            }else{
                nums[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<nl){
            nums[k] = left[i];
            i++;
            k++;
        }
        while (j<nr){
            nums[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        for (int i:new SquaresOfASortedArray().sortedSquares(nums)){
            System.out.println(i);
        }
    }
}
