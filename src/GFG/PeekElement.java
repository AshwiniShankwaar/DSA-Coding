package GFG;

public class PeekElement {
    public static void main(String[] args) {
        System.out.println(peakElement(new int[]{1,13}));
    }
//    public static int peakElement(int[] arr,int n)
//    {
//        int peek;
//        if(n==1){
//            return 0;
//        }
//        peek = 0;
//        for(int i = 1;i<n;i++){
//            if(arr[peek]<arr[i]) peek = i;
//        }
//        return peek;
//    }
    public static int peakElement(int[] arr){
        return getpeakElement(arr,arr.length,0,arr.length-1);
    }

    private static int getpeakElement(int[] arr, int n, int low, int high) {
        int mid = (low+high)/2;
        if((mid==0 || arr[mid]>arr[mid-1]) && (mid==n-1 || arr[mid]>arr[mid+1])){
            return mid;
        } else if ((mid>0 && arr[mid]>arr[mid+1])) {
            return getpeakElement(arr, n,low,mid-1);
        }else{
            return getpeakElement(arr,n,mid+1,high);
        }
    }
}
