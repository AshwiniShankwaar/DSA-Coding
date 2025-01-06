package Target100In30DaysEnd16JanLeetCode.HashTable;
import java.util.Arrays;
import java.util.HashSet;
/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 * */
public class IntersectionOfTwoArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num:nums1){
            set.add(num);
        }
        HashSet<Integer> res = new HashSet<Integer>();
        for (int num:nums2){
            if(set.contains(num)){
                res.add(num);
            }
        }

        Integer[] arr = res.toArray(new Integer[res.size()]);
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i] = arr[i];
        }
        return result;
    }
}
