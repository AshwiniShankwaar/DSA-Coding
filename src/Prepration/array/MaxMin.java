package Prepration.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = new int[]{4,8,1,6,3,12,-4};  //-4,1,3,4,6,8,12
//        Map<String,Integer> res = maxMin(arr);
//        Map<String,Integer> res = new KthSmallestOrLargest()
//                .KthValueUsingMergeSort(arr,3);
//        Map<String,Integer> res = new KthSmallestOrLargest()
//                .KthValueUsingMaxMinHeap(arr,3);
//        res.forEach(
//                (key,value)-> System.out.printf("%s : %d\n",key,value)
//                );

        System.out.printf(" min : %d",new KthSmallestOrLargest()
                .KthSmallestElement(arr,3));
    }
    public static Map<String, Integer> maxMin(int[] arr){
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
        //System.out.printf("max: %d, min: %d",arr[maxindex],arr[minindex]);
        Map<String,Integer> res = new HashMap<>();
        res.put("max",arr[maxindex]);
        res.put("min",arr[minindex]);
        return res;
    }
}
