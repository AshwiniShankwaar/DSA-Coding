package Prepration.Search;
//time complexity is O(1)
public class Interpolation {
    public static void main(String[] args) {
        interpolationSearch(new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47},42);
    }
    public static void interpolationSearch(int[] arr,int key){

        int low = 0;//start index
        int high = arr.length-1;//end index
        int position = -1;//to store the position of the key
        if(arr[0]>key||arr[arr.length-1]<key){
            //check if the first value of the array is greater then the key or value in the last position of
            // the array is smaller then key
            System.out.println("key not available");
            return;
        }
        while(position == -1){//true untill position is found
            int x = key-arr[low];
            int y = arr[high] - arr[low];
            int z = high-low;
            float k = ((float)x/y)*z;
            int pos = low + (int)k;
            if(arr[pos] == key){
                position = pos;
                System.out.println(position);
            }
            if(arr[pos]<key){
                low = pos+1;
            }else if(key>arr[pos]){
                high = pos -1;
            }
        }
    }
}
