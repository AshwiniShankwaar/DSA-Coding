package Target100In30DaysEnd16JanLeetCode.slidingWindow.easy;

import java.util.*;

/**
 * You are given an array nums of n integers and two integers k and x.
 *
 * The x-sum of an array is calculated by the following procedure:
 *
 * Count the occurrences of all elements in the array.
 * Keep only the occurrences of the top x most frequent elements. If two elements have the same
 * number of occurrences, the element with the bigger value is considered more frequent.
 * Calculate the sum of the resulting array.
 * Note that if an array has less than x distinct elements, its x-sum is the sum of the array.
 *
 * Return an integer array answer of length n - k + 1 where answer[i] is the x-sum of the
 * subarray
 *  nums[i..i + k - 1].
 * */
public class X_sum_Of_All_K_Subarray {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] answer = new int[nums.length-k+1];

        //approach brute force
        Map<Integer,Integer> countMap = new HashMap<>();

        int i = 0;
        for (int j = 0; j < nums.length;j++){
            countMap.put(nums[j],countMap.getOrDefault(nums[j],0)+1);
            if(j-i+1 > k){
                countMap.put(nums[i],countMap.get(nums[i])-1);
                if(countMap.get(nums[i]) == 0){
                    countMap.remove(nums[i]);
                }
                i++;
            }
            if(j-i+1 == k){
                answer[i] = calculateX(countMap,x);
            }
        }
        return answer;
    }

    private int calculateX(Map<Integer, Integer> countMap, int x) {
        //sort the map by value if the value is 1 then sort by key
        List<Map.Entry<Integer,Integer>> sorted_List = new ArrayList<>(countMap.entrySet());
        sorted_List.sort(
                (a,b)->{
                    if(a.getValue()> 1 && b.getValue()>1){
                        int valueCompare = b.getValue().compareTo(a.getValue());
                        return valueCompare != 0 ? valueCompare : b.getKey().compareTo(a.getKey());
                    } else if (a.getValue() ==1 && b.getValue() ==1) {
                        return b.getKey().compareTo(a.getKey());
                    } else if (a.getValue()>1 && b.getValue() == 1) {
                        return -1;
                    } else if (a.getValue() == 1 && b.getValue()> 1) {
                        return 1;
                    }else{
                        return b.getValue().compareTo(a.getValue());
                    }

                }
        );
        int sum = 0,count = 0;
        for(Map.Entry<Integer,Integer> m:sorted_List){
            if(count == x) break;
            sum+=(m.getValue()*m.getKey());
            count++;
        }
        return sum;
    }
}
