package Target100In30DaysEnd16JanLeetCode.dp;

import java.util.HashMap;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        arr[0] =1;
        arr[1] =1;
        int i =2;
        while (i<(n+1)){
            arr[i] =arr[i-1]+arr[i-2];
            i++;
        }
        return arr[n];
    }
}
