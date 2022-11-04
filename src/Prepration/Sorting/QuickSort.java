package Prepration.Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] k = sortdata(new int[]{10, 80, 30, 90, 40, 50, 70},0,6);
        for(int i: k){
            System.out.println(i);
        }
    }

    private static int[] sortdata(int[] arr,int s,int e) {
        if(s>=e) return arr;
        int pindex = partition(arr,s,e);
        sortdata(arr,s,pindex-1);
        sortdata(arr,pindex+1,e);
        return arr;
    }

    private static int partition(int[] arr, int s, int e) {
        int p = arr[e];
        int pindex = s;
        for (int i = s; i < e; i++) {
            if(arr[i]<=p){
                int temp = arr[i];
                arr[i] = arr[pindex];
                arr[pindex] = temp;
                pindex++;
            }
        }
        int temp = arr[e];
        arr[e] = arr[pindex];
        arr[pindex] = temp;
        return pindex;
    }
}
