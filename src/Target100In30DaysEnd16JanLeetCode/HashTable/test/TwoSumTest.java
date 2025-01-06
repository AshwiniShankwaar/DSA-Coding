package Target100In30DaysEnd16JanLeetCode.HashTable.test;

import Target100In30DaysEnd16JanLeetCode.HashTable.TwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{2,7,11,15},9,new int[]{0,1}),
                Arguments.of(new int[]{3,2,4},6,new int[]{1,2}),
                Arguments.of(new int[]{3,3},6,new int[]{0,1}),
                Arguments.of(new int[]{-3,4,3,90},0,new int[]{0,2})
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void twoSum(int[] arr, int target,int[] output) {
        Assertions.assertArrayEquals(new TwoSum().twoSum(arr,target),output);
    }
}