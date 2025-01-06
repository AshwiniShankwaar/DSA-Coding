package Target100In30DaysEnd16JanLeetCode.twoPointer.test;

import Target100In30DaysEnd16JanLeetCode.twoPointer.easy.TwoSumII_InputArrayIsSorted;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumII_InputArrayIsSortedTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
//                Arguments.of(new int[]{2,7,11,15},9,new int[]{1,2}),
//                Arguments.of(new int[]{2,3,4},6,new int[]{1,3}),
//                Arguments.of(new int[]{-1,0},-1,new int[]{1,2}),
                Arguments.of(new int[]{5,25,75},100,new int[]{2,3})

        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void twoSum(int[] input,int target,int[] output) {
        Assertions.assertArrayEquals(new TwoSumII_InputArrayIsSorted().twoSum(input, target),output);
    }
}