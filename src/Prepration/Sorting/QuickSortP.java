package Prepration.Sorting;

public class QuickSortP {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 80, 30, 90, 40, 50, 70};
        sortdata(arr,0,6);
        for(int i: arr)
            System.out.println(i);

    }
    public static void sortdata(int[] arr,int start,int end){
        if(start>=end) return;
        int pindex = partition(arr,start,end);
        sortdata(arr,start,pindex-1);
        sortdata(arr,pindex+1,end);

    }
    public static int partition(int[] arr,int start,int end){
        int mid = (start+end)/2;
        swap(arr,mid,end);
        int left = start;
        int right = end-1;
        while (true){
            if(arr[left]>=arr[end]){
                break;
            }
            left++;
        }
        while (true){
            if(arr[right]<arr[end]){
                break;
            }
            right--;
        }
        if(left<right){
            swap(arr,left,right);//...
        }else {
            swap(arr,left,end);
        }
        return left;
    }
    public static void swap(int[] arr,int mid,int end){
        int temp = arr[mid];
        arr[mid] = arr[end];
        arr[end] = temp;
    }
}
