package Target100In30DaysEnd16JanLeetCode.testCases;

import Target100In30DaysEnd16JanLeetCode.SumOfAllOddLengthSubarray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumOfAllOddLengthSubarrayTest {

    SumOfAllOddLengthSubarray test = new SumOfAllOddLengthSubarray();

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[] {1,4,2,5,3},58),
                Arguments.of(new int[] {1,2},3),
                Arguments.of(new int[] {10,11,12},66)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void sumOddLengthSubarrays(int[] arr,int output) {
        Assertions.assertEquals(test.sumOddLengthSubarrays(arr),output);
    }
}