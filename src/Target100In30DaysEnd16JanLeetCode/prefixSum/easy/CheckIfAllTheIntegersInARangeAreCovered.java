package Target100In30DaysEnd16JanLeetCode.prefixSum.easy;
/**
 * You are given a 2D integer array ranges and two integers left and right. Each ranges[i] =
 * [starti, endi] represents an inclusive interval between starti and endi.
 *
 * Return true if each integer in the inclusive range [left, right] is covered by at least one
 * interval in ranges. Return false otherwise.
 *
 * An integer x is covered by an interval ranges[i] = [starti, endi] if starti <= x <= endi.
 * */
public class CheckIfAllTheIntegersInARangeAreCovered {

    public boolean isCovered(int[][] ranges, int left, int right) {

        //optimised

        int boundary = left;
        int idx = 0;

        while (boundary <= right && idx < ranges.length) {
            if (ranges[idx][0] <= boundary && ranges[idx][ranges[idx].length - 1] >= boundary) {
                boundary++;
                idx = 0;
                continue;
            }
            idx++;
        }
        return boundary > right;
        // my way
//        int[] arr = new int[51];
//        boolean covered = true;
////        int min = Integer.MAX_VALUE;
////        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < ranges.length; i++) {
//            int start = ranges[i][0];
//            int end = ranges[i][1];
////            arr[start] = 1;
////            arr[end] = 1;
////            if(end>max) max = end;
////            if(start<min) min = start;
//            for(int j = start;j<=end;j++){
//                arr[j] =1;
//            }
//        }
//        for (int i = left; i <= right ; i++) {
//            if(arr[i]== 0){
//                covered = false;
//                break;
//            }
//        }
//        if(left>=min && max>=right){
//            covered = true;
//        }
//        for (int i = 1; i < arr.length; i++) {
//            arr[i] = arr[i-1]+arr[i];
//        }
//        if(arr[left]!=0 && arr[arr.length-1]>=arr[right]) covered = true;
//        if(arr[left]==0 ) covered = false;
//        if(arr[right] > arr[left] || arr[right]<arr[arr.length-1]) covered = true;
        //return covered;
    }
}
