package Prepration.Sorting;
//Time complexity
// Best    O(n^2);
//worst    O(n^2);
//average  O(n^2);
//stability No
public class Selection {
    public static void main(String[] args) {
        int[] arr = SelectionSort(new int[]{64, 25, 12, 22, 11});
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    private static int[] SelectionSort(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            int min = i;
            for(int j = i+1;j< arr.length;j++){
                if(arr[j]<arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
