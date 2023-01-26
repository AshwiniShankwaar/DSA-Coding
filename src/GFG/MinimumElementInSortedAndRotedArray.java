package GFG;

import java.util.Arrays;

public class MinimumElementInSortedAndRotedArray {
    public static void main(String[] args) {
        MinimumElementInSortedAndRotedArray m= new MinimumElementInSortedAndRotedArray();
        System.out.println(m.findMin(new int[]{10, 20, 30, 40, 50, 5, 7},7));
    }
    int findMin(int arr[], int n)
    {

        //complete the function here
        Arrays.sort(arr);
        return arr[0];
//        int ans=-1;
//        int start = 0;
//        int end = n-1;
//        while (start<end){
//            int mid = (start+end)/2;
//            if(arr[mid-1]>arr[mid]&&arr[mid]<arr[mid+1]){
//                ans = arr[mid];
//                break;
//            }
//            if(arr[mid]<arr[end]){
//                end = mid-1;
//            }else if(arr[mid]>arr[end]){
//                start = mid+1;
//            }
//        }
//        return ans;
    }
}
