package Target100In30DaysEnd16JanLeetCode.testCases;

import Target100In30DaysEnd16JanLeetCode.MakeArrayElementEqualToZero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MakeArrayElementEqualToZeroTest {

    MakeArrayElementEqualToZero test = new MakeArrayElementEqualToZero();

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1,0,2,0,3},2),
                Arguments.of(new int[]{2,3,4,0,4,1,0},0)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void countValidSelections(int[] arr, int output) {
        Assertions.assertEquals(test.countValidSelections(arr),output);
    }
}