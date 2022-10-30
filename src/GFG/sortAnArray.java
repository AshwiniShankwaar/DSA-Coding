package GFG;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class sortAnArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
        String data = bufferedReader.readLine();
        String[] arr = data.split(" ");
        int[] a = new int[arr.length];
        int i = 0;
        for (String k:arr) {
            a[i] = Integer.parseInt(k);
            i++;
        }

        int[] x = sortArr(a,a.length);
        for (int k:x) {
            System.out.print(k+" ");
        }
    }
    static int[] sortArr(int[] arr, int n)
    {
          
//        if(n<2) return arr;
//        int mid = n/2;
//        int[] left = new int[mid];
//        int[] right = new int[mid];
//        for (int i = 0; i <= mid-1; i++) {
//            left[i] = arr[i];
//        }
//        for (int i = mid; i < n; i++) {
//            right[i-mid] = arr[i];
//        }
//        int[] l = sortArr(left, left.length);
//        int[] r = sortArr(right, right.length);
//        arr = sorted(l,r,arr);
        return arr;
    }

    private static int[] sorted(int[] left, int[] right, int[] arr) {

        int nl = left.length;
        int nr = right.length;;
        int i, j,k;
        i = j = k = 0;
        while(i<nl && j<nr){
            if(left[i]<=right[i]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<nl) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<nr) {
            arr[k] = right[j];
            j++;
            k++;
        }
        return arr;
    }

}
