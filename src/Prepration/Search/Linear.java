package Prepration.Search;
//Time complexity is O(n)
public class Linear {
    public static void main(String[] args) {
        LinearSearch(new int[]{10, 20, 80, 30, 60, 50,110, 100, 130, 170},110);
    }
    public static void LinearSearch(int[] arr,int key){
        for(int i = 0;i< arr.length;i++){
            if(arr[i] == key) System.out.println(i);
        }
    }
}
