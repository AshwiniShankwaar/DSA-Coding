package Prepration.Search;

public class UbiquitousBinarySearch {
    public static int binarySearch(int arr[], int x, int n) {
        int low = 0;
        int high = n-1;
        while(high-low>1){
            int mid = (low+high)/2;
            if(arr[mid]<x)
                low = mid+1;
            else
                high = mid-1;
        }

        return low;
    }
    public static void main(String[] args) {
        int arr[] = { 10, 22, 35, 40, 45, 50,
                80, 82, 85, 90, 100,235};
        int n = 12;
        int x = 235;
        int ind = binarySearch(arr,x,n);
        if(ind>=0)
            System.out.print("Found at index: "
                    +ind);
        else
            System.out.print(x+" isn't present in the array");
    }
}
