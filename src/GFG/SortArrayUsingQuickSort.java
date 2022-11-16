package GFG;

public class SortArrayUsingQuickSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 6, 10, 4, 1, 3, 9, 7};
        quickSortMain(a,0,9);
        for (int x:a) {
            System.out.println(x);
        }
    }
    public static void quickSortMain(int arr[], int low, int high)
    {
        // code here
        if(low>=high)return;
        int pindex = partition(arr, low, high);
        quickSortMain(arr, low, pindex-1);
        quickSortMain(arr, pindex+1, high);
    }
    public static int partition(int arr[], int low, int high)
    {
        // your code here
        int p = arr[high];
        int pindex = low;
        for (int i = low; i < high; i++) {
            if(arr[i]<=p){
                int temp = arr[i];
                arr[i] = arr[pindex];
                arr[pindex] = temp;
                pindex++;
            }
        }
        int temp = arr[high];
        arr[high] = arr[pindex];
        arr[pindex] = temp;
        return pindex;
    }
}
