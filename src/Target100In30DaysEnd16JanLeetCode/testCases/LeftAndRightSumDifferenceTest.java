package Target100In30DaysEnd16JanLeetCode.testCases;

import Target100In30DaysEnd16JanLeetCode.prefixSum.easy.LeftAndRightSumDifference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class LeftAndRightSumDifferenceTest {

    LeftAndRightSumDifference l = new LeftAndRightSumDifference();

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{10,4,8,3},new int[]{15,1,11,22}),
                Arguments.of(new int[]{1},new int[]{0})
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void leftRightDifference(int[] input,int[] output) {
        Assertions.assertArrayEquals(l.leftRightDifference(input),output);
    }
}