package Prepration.Search;
//Time complexity is O(Log n)
public class bineary {
    public static void main(String[] args) {
        binarySearch(new int[]{10, 20, 30, 50, 60, 80, 110, 130, 140, 170},110);
    }
    public static void binarySearch(int[] arr,int key){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid] == key){
                System.out.println(mid+1);
            }else if(arr[mid]<key){
                s = mid+1;
            }else if(arr[mid]>key){
                e = mid-1;
            }else{
                System.out.println("key not found");
            }
        }
    }
}
