package LeetCode;

import java.util.Arrays;

public class Problem88 {
    public static void main(String[] args) {
        Problem88 p = new Problem88();
        p.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
        for (int i:nums1) {
            System.out.println(i);
        }
    }
}
