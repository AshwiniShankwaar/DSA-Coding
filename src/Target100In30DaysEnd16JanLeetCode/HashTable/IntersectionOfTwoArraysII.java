package Target100In30DaysEnd16JanLeetCode.HashTable;

import java.util.ArrayList;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each
 * element in the result must appear as many times as it shows in both arrays and you may
 * return the result in any order.
 * */
public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] num1, int[] num2) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i =0;i<num1.length;i++){
            for(int j = 0;j<num2.length;j++){
                if(num1[i] == num2[j] && (num1[i]>=0 && num2[j]>=0)){
                    l.add(num1[i]);
                    num1[i] = -1;
                    num2[j] = -1;
                    break;
                }
            }
        }
        int s = l.size();
        int[] x = new int[s];
        int i =0;
        for(int k:l){
            x[i] = k;
            i++;
        }
        return x;
    }
}
