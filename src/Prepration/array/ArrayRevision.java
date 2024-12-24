package Prepration.array;

import java.util.Scanner;

public class ArrayRevision {
    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
//        Scanner scanner = new Scanner(System.in);
//        for(int i = 0; i < 10; i++) {
//            int x = scanner.nextInt();
//            arr[i] = x;
//        }
//        int size = arr.length; //10
//        size = delete(arr,7,size);//9    1,2,3,4,5,6,7,9,10
//        size = delete(arr,3,size);//8    1,2,3,5,6,7,9,10
//        System.out.println("printing the array");
//        for (int i = 0; i < size; i++) {
//            System.out.println(arr[i]);
//        }

        //2d array

    }
    public static int delete(int[] arr, int pos,int size){
        for (int i = pos;i< size-1;i++){
            arr[i] = arr[i+1];
        }
        return size-1;
    }
}
