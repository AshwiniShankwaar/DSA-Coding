package Prepration.Sorting;

public class MeregSort {
    public static void main(String[] args) {
        merge(new int[]{18,32,5,2,47,15,11,37});
//        for (int y:x) {
//            System.out.print(y+" ");
//        }
    }
    public static void merge(int arr[]){
       int n = arr.length;
       if(n<2) return;
       int mid = n/2;
       int left[] = new int[mid];
       int right[] = new int[n-mid];
        for (int i = 0; i <= mid-1; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i-mid] = arr[i];
        }
        merge(left);
        merge(right);
        sort(left,right,arr);

    }

    private static void sort(int[] left, int[] right, int[] arr) {
        int nl = left.length;
        int nr = right.length;;
        int i, j,k;
        i = j = k = 0;
        while(i<nl && j<nr){
            if(left[i]<=right[i]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = left[j];
                j++;
            }
            k++;
        }
        while(i<nl) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<nr) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }
}
