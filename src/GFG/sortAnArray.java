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

        int[] x = sortArr(a, arr.length);
        Arrays.sort(a);
        for (int j = 0; j < a.length; j++) {
            if(x[j]!=a[j]){
                System.out.println(x[i]+" "+a[i]);
            }
        }
    }
    static int[] sortArr(int[] arr, int n)
    {
        int[] left = null;
        int[] right = null;
        if(n<2) return arr;
        int mid = n/2;
        if((n % 2) ==0){
            left = new int[mid];
            right = new int[mid];
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            for (int i = mid; i <n ; i++) {
                right[i-mid] = arr[i];
            }
        }else{
            left = new int[mid];
            right = new int[mid+1];
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            for (int i = mid; i <n ; i++) {
                right[i-mid] = arr[i];
            }
        }
        int[] l = sortArr(left, left.length);
        int[] r =sortArr(right, right.length);
        arr = sorted(l,r,arr);
        return arr;
    }

    private static int[] sorted(int[] l, int[] r, int[] arr) {
        int i,j,k,nl,nr;
        i=j=k = 0;
        nr = r.length;
        nl = l.length;
        while (i<nl && j<nr){
            if(l[i]<=r[j]){
                arr[k] = l[i];
                i++;
                k++;
            }else{
                arr[k] = r[j];
                j++;
                k++;
            }
        }
        while(i<nl){
            arr[k] = l[i];
            i++;
            k++;
        }
        while(j<nr){
            arr[k] = r[j];
            j++;
            k++;
        }
        return arr;
    }

}
