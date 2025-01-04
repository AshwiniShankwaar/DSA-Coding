package Target100In30DaysEnd16JanLeetCode.testCases;

import Target100In30DaysEnd16JanLeetCode.prefixSum.med.BinarySubarraysWithSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BinarySubarraysWithSumTest {

    BinarySubarraysWithSum test = new BinarySubarraysWithSum();

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 1, 0, 1}, 2, 4),
                Arguments.of(new int[]{0, 0, 0, 0, 0}, 0, 15),
                Arguments.of(new int[]{1, 1, 1, 1, 1}, 3, 3),
                Arguments.of(new int[]{1, 0, 0, 1, 0}, 1, 9),
                Arguments.of(new int[]{1, 0, 1, 1, 0}, 3, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void numSubarraysWithSum(int[] input, int goal,int output) {
        Assertions.assertEquals(test.numSubarraysWithSum(input,goal),output);
    }
}