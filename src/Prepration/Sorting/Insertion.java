package Prepration.Sorting;
//Time complexity
// Best    O(n);
//worst    O(n^2);
//average  O(n^2);
//stability yes
public class Insertion {
    public static void main(String[] args) {
        int[] arr = sort(new int[]{64, 25, 12, 22, 11});
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0&&key<arr[j]){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
