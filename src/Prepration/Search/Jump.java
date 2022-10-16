package Prepration.Search;
//Time complexity is O(n^(1/2))
public class Jump {
    public static void main(String[] args) {
        jumpSearch(new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21,34, 55, 89, 144, 233, 377, 610},-8);
    }
    public static void jumpSearch(int[] arr,int key){
        int jumpsize = 3;
        int p1 = 0;
        int p2 = p1+jumpsize;
        int position = -1;
        while(position == -1){
            if(arr[p1] > key){
                System.out.println("key not available");
                break;
            }
            if(p2<= arr.length-1){
                if(arr[p1] ==key) position = p1;
                if(arr[p2] == key) position = p2;
                if(key<arr[p2] && key>arr[p1]){
                    position = linearSearch(arr,p1,p2,key);
                }else{
                    p1 = p2+1;
                    p2 = p1+jumpsize;
                }
            }else{
                System.out.println("key not present");
                break;
            }
        }
        System.out.println(position);
    }

    private static int linearSearch(int[] arr, int p1, int p2, int key) {
        int o = -1;
        for (int i = p1; i <=p2 ; i++) {
            if(arr[i] == key) o=i;
        }
        return o;
    }
}
