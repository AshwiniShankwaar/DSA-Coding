package Target100In30DaysEnd16JanLeetCode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * You are given an integer array nums of length n, and an integer array queries of length m.
 *
 * Return an array answer of length m where answer[i] is the maximum size of a subsequence
 * that you can take from nums such that the sum of its elements is less than or equal to queries[i].
 *
 * A subsequence is an array that can be derived from another array by deleting some or no
 * elements without changing the order of the remaining elements.
 * */
public class LongestSubsequenceWithLimitedSum {
    public int[] answerQueries(int[] nums, int[] queries) {

        //sort the nums arry
        Arrays.sort(nums);
        //prefix sum of the nums array
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        // for each queries search using binary search if element is present then return index
        for (int i = 0; i < queries.length; i++) {
            int index= binary_Search(nums, queries[i]);
            queries[i] = index;
        }
        //return strat+1
        //store the index in query
        return queries;


//        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            int x = nums[i];
//            map.put(x,1);
//            int j = i+1;
//            while(j< nums.length){
//                x = x+nums[j];
//                int size = j-i+1;
//                map.put(x,map.containsKey(x)?map.get(x)<size?size:map.get(x):size);
//                j++;
//            }
//        }
//
//        return queries;
    }
    int binary_Search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target) return mid+1;
            else if(arr[mid]<target) start = mid+1;
            else if (arr[mid]>target) end = mid-1;
        }
        return start;
    }
}
