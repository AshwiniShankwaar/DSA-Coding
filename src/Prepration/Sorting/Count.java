package Prepration.Sorting;

public class Count {
    public static void main(String[] args) {
        int[] k = countSort(new int[]{1, 4, 1, 2, 7, 5, 2});
        for (int i:k) {
            System.out.println(i);
        }
    }

    private static int[] countSort(int[] arr) {
        int[] out = new int[arr.length];
        int min = Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }if(min>arr[i]) min = arr[i];
        }
        int[] a = new int[max-min+1];
        for (int i = 0; i < arr.length; i++) {
            a[arr[i]-min] +=1;
        }
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            int l = a[i];
            while(l!=0){
                arr[index] = i+1;
                index++;
                l=l-1;
            }
        }
        return arr;
    }
}
