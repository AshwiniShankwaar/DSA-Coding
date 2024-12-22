package Prepration.array;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = new int[]{4,8,1,6,3,12,-4};
        maxMin(arr);
    }
    public static void maxMin(int[] arr){
        int maxindex = 0;
        int minindex = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[minindex]){
                minindex = i;
            }
            if(arr[i]>arr[maxindex]){
                maxindex = i;
            }
        }
        System.out.printf("max: %d, min: %d",arr[maxindex],arr[minindex]);
    }
}
