package extra.Coursera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AnkitTCS2 {
    public static void main(String[] args) {
        int n,x,y,z;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n ; j++) {
                sum +=arr[j];
                list.add(sum);
            }
        }
//        Collections.sort(list);
//        Collections.reverse(list);
        arr = new int[list.size()];
        int k = 0;
        for (Integer l:list
             ) {
            arr[k] = l;
            k++;
        }
        quickSort(arr,0, arr.length-1);

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(list.get(x-1)+ " "+list.get(y-1)+" "+list.get(z-1));

    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high)
    {

        // pivot
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
