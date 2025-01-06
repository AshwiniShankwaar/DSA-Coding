package Target100In30DaysEnd16JanLeetCode.Array;
/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * */
public class RotateArray {
    public int[] rotate(int[] nums, int k) {

        int n = nums.length;
        k = k%n;
        if(k>n){
            return nums;
        }
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);


        //my logic
//        if(nums.length <2||k==0) return nums;
//        if(k> nums.length) k%=nums.length;
//        int[] temp = new int[k];
//        int temp_k = k;
//        int j = 0;
//        while(k>0){
//            temp[k-1] = nums[nums.length-1-j];
//            j++;
//            k--;
//        }
////        temp[k] = nums[nums.length-1-j];
//        for (int i = nums.length-1; i >(temp_k-1); i--) {
//            nums[i] = nums[i-temp_k];
//        }
//        for (int i = 0; i < temp_k; i++) {
//            nums[i] = temp[i];
//        }

//        for (int i = 0; i < k; i++){
//            int x = nums[nums.length-1];
//            for (int j = nums.length-1; j >0; j--) {
//                nums[j] = nums[j-1];
//            }
//            nums[0] = x;
//        }
        return nums;
    }
    public void reverse(int arr[], int sIndex, int eIndex){
        while(sIndex<eIndex){
            int temp = arr[sIndex];
            arr[sIndex] = arr[eIndex];
            arr[eIndex] = temp;
            sIndex++;
            eIndex--;
        }
    }
}
