package Prepration.Search;

public class UnboundedBineary {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i+1;
        }

        int jumpsize = 10;
        int j = 9;
        int i = 0;
        int key = 567;
        while(arr[j]<key){
            i = j+1;
            j = j+jumpsize;
        }
        Search(arr,key,i,j);
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
