package Prepration.Search;
//Time complexity is O(n^(1/2))
public class Jump {
    public static void main(String[] args) {
        jumpSearch(new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21,34, 55, 89, 144, 233, 377, 610},144);
    }
    public static void jumpSearch(int[] arr,int key){
        int jumpsize = 3;//block size
        int p1 = 0; //start
        int p2 = p1+jumpsize; //end
        int position = -1; //position of the key that need to be find
        while(position == -1){//true untill key is found
            if(arr[p1] > key){//if the first value of the array is greater then the key.
                System.out.println("key not available");
                break;
            }
            if(p2<= arr.length-1){//true if the end is smaller then the array length.
                if(arr[p1] ==key) position = p1;//if the key is available in the first position of the block.
                if(arr[p2] == key) position = p2;//if the key is available in the last position of the block
                if(key<arr[p2] && key>arr[p1]){//if the key is smaller then the last position of the block
                    //  and the key is larger then the first position of the block.
                    position = linearSearch(arr,p1,p2,key);
                }else{
                    p1 = p2+1;//last position of current block +1
                    p2 = p1+jumpsize;// fist position of the new block +jump size.
                }
            }else{//print when all the blocks are been searched.
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
