package Target100In30DaysEnd16JanLeetCode.prefixSum.med;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a binary array nums and an integer goal, return the number of non-empty subarrays
 * with a sum goal.
 *
 * A subarray is a contiguous part of the array.
 * */
public class BinarySubarraysWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {

        /**
         * Explanation:
         * Initialization:
         *
         * Start with prefixSum = 0 and count = 0.
         * Add 0 to the HashMap with a count of 1 to handle cases where the subarray starts from the beginning.
         * Iterate through the array:
         *
         * Add the current element to prefixSum.
         * Check if (prefixSum - goal) exists in the HashMap. If it does, it means there is a subarray that sums to goal, and the count of such subarrays is added to count.
         * Update the HashMap with the current prefixSum.
         * Complexity:
         *
         * Time Complexity: O(𝑛)
         * O(n) because each element is processed once.
         * Space Complexity: 𝑂(𝑛)
         * O(n) for the HashMap
         *
         * */
        int count = 0;
        int prefixSum = 0;
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1); // Base case: a sum of 0 occurs once.

        for (int num : nums) {
            prefixSum += num;

            // Check if there's a prefixSum that, when subtracted from the current prefixSum, equals the goal.
            if (prefixSumMap.containsKey(prefixSum - goal)) {
                count += prefixSumMap.get(prefixSum - goal);
            }

            // Update the HashMap with the current prefixSum.
            prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;


//        brutal force
//        int count = 0;
//        int sum = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            sum=nums[i];
//            for (int j = i+1; j < nums.length; j++) {
//
//                if(sum==goal){
//                    count++;
//                }sum+=nums[j];
//
//            }
//            if(sum==goal) count++;
//        }
//
//
//        return count;
    }
}
