package Target100In30DaysEnd16JanLeetCode.HashTable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashMap;
/**
 *Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return the number
 * of tuples (i, j, k, l) such that:
 *
 * 0 <= i, j, k, l < n
 * nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
 * */
public class FourSumII {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        for (int i:nums1) {
            for (int j:nums2){
                map.put(i+j,map.getOrDefault(i+j,0)+1);
            }
        }
        for(int i:nums3) {
            for (int j:nums4){
                result+=map.getOrDefault(-(i+j),0);
            }
        }
        return result;
        //memory limit extends

//        List<Integer> res = new ArrayList<Integer>();
//        for (int i:nums1){
//            res.add(i);
//        }
//        res = getSumList(nums2,res);
//        res = getSumList(nums3,res);
//        res = getSumList(nums4,res);
//        return res.stream().filter((e)->e==0).toList().size();

        //memory limit extends
//        List<Integer> sum = new ArrayList<Integer>();
//        List<Integer> temp = new ArrayList<>();
//        //add num1 in sum
//        for (int i : nums1){
//            sum.add(i);
//        }
//        for (int i : sum){
//            for (int j : nums2){
//                temp.add(i+j);
//            }
//        }
//        sum.clear();
//        sum.addAll(temp);
//        temp.clear();
//        for (int i : sum){
//            for (int j : nums3){
//                temp.add(i+j);
//            }
//        }
//        sum.clear();
//        sum.addAll(temp);
//        temp.clear();
//        for (int i : sum){
//            for (int j : nums4){
//                temp.add(i+j);
//            }
//        }
//        return temp.stream().filter((e)->e==0).toList().size();
    }

//    private List<Integer> getSumList(int[] nums, List<Integer> res) {
//        List<Integer> temp = new ArrayList<>();
//        for(int i: nums){
//            for (int r:res){
//                temp.add(i+r);
//            }
//        }
//        return temp;
//    }
}
