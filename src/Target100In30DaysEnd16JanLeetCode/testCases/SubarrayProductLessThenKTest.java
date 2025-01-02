package Target100In30DaysEnd16JanLeetCode.testCases;

import Target100In30DaysEnd16JanLeetCode.prefixSum.med.SubarrayProductLessThenK;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SubarrayProductLessThenKTest {

    SubarrayProductLessThenK test  = new SubarrayProductLessThenK();

    public static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.of(new int[]{10, 5, 2, 6}, 100, 8),
                Arguments.of(new int[]{1, 2, 3}, 0, 0),
                Arguments.of(new int[]{1, 1, 1}, 2, 6),
                Arguments.of(new int[]{1, 2, 3, 4}, 10, 7),
                Arguments.of(new int[]{10, 5, 2}, 10, 2),
                Arguments.of(new int[]{}, 10, 0),
                Arguments.of(new int[]{1}, 2, 1),
                Arguments.of(new int[]{10, 10, 10}, 50, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void numSubarrayProductLessThanK(int[] arr,int k,int output) {
        Assertions.assertEquals(test.numSubarrayProductLessThanK(arr,k),output);
    }
}