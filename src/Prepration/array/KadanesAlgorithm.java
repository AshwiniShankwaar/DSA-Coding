package Prepration.array;

import org.junit.jupiter.api.Assertions;

public class KadanesAlgorithm {
    public int maximumSumSubarray(int[] nums){
        int currentbest = nums[0];
        int overallbest = nums[0];
        for (int i=1;i< nums.length;i++) {
            if(currentbest>=0){
                currentbest+=nums[i];
            }else{
                currentbest = nums[i];
            }
            if(overallbest<currentbest){
                overallbest = currentbest;
            }

        }
        return overallbest;
    }

    public static void main(String[] args) {
        int[] array = new int[]{4,3,-2,6,-14,7,-1,4,5,7,-10,2,9,-10,-5,-9,6,1};

        KadanesAlgorithm algorithm = new KadanesAlgorithm();
        int x = algorithm.maximumSumSubarray(array);

        Assertions.assertEquals(x,23);
    }
}
