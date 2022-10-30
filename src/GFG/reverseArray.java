package GFG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < t; i++) {
            int size = Integer.parseInt(bufferedReader.readLine());
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = Integer.parseInt(bufferedReader.readLine());
            }
            for (int j = size; j>=0; j--) {
                System.out.print(arr[j]+" ");
            }
//            int[] out = revers(arr);
//            for (int o:out) {
//                System.out.print(o+" ");
//            }
        }

    }

//    private static int[] revers(int[] arr) {
//        for (int i = 0; i < arr.length/2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length-i-1];
//            arr[arr.length-i-1] = temp;
//        }
//        return arr;
//    }
}
