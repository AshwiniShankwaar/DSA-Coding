package Prepration.Search;

public class Exponential {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i+1;
        }

        int i = 1;
        int key = 567;
        int n = arr.length;
        while(i<n && arr[i]<=key){
            i = i*2;
        }
        Search(arr,key,i/2,Math.min(i,n-1));
    }
    public static void Search(int[] arr,int key,int s,int e){
        int pos = -1;
        while (pos == -1){
            int mid = (s+e)/2;
            if(arr[mid] == key) pos = mid;
            if(arr[mid]<key) s = mid+1;
            else if(arr[mid]>key) e = mid-1;
        }
        System.out.println(pos);
    }
}
