package Target100In30DaysEnd16JanLeetCode.prefixSum.easy;

import java.util.List;
import java.util.ListIterator;

/**
 * You are given a 0-indexed 2D integer array nums representing the coordinates of the cars
 * parking on a number line. For any index i, nums[i] = [starti, endi] where starti is the
 * starting point of the ith car and endi is the ending point of the ith car.
 *
 * Return the number of integer points on the line that are covered with any part of a car.
 * */
public class PointsInteractWithCars {
    public int numberOfPoints(List<List<Integer>> nums) {

        //optimised solution
        int[] arr = new int[102];
        for (int i = 0; i < nums.size(); i++) {
            arr[nums.get(i).get(0)] +=1;
            arr[nums.get(i).get(1)+1] -=1;
        }

        int ans = 0;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] +arr[i-1];
            if(arr[i]!=0) ans++;
        }

        return ans;


        //my solution
//        int[] arr = new int[101];
//        //int i = 0;
//        ListIterator<List<Integer>> l = nums.listIterator();
//        while (l.hasNext()){
//            List<Integer> ln = l.next();
//            int start = ln.get(0);
//            int end = ln.get(ln.size()-1);
//            for (int j = start; j <= end; j++) {
//                arr[j] = 1;
//            }
//        }
//        for (int i = 1; i < arr.length; i++) {
//            arr[i] = arr[i-1]+arr[i];
//        }
//        return arr[arr.length-1];
    }
}
