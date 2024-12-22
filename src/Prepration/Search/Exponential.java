package Prepration.Search;

public class Exponential {
    public static void main(String[] args) {
        int[] arr = new int[1000];//array create
        for (int i = 0; i < 1000; i++) {//fill the array
            arr[i] = i+1;//insert the value in the array position 'i'
        }
        int i = 1; // initial position
        int key = 567;//key
        int n = arr.length; //array size
        while(i<n && arr[i]<=key){//if the initial position is smaller then array.length and value in ith
            //position of the array is smaller or equal to key
            i = i*2;//then i*2;
        }
        Search(arr,key,i/2,Math.min(i,n-1));
    }
    public static void Search(int[] arr,int key,int s,int e){//binary search
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
