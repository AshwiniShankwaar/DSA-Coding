package Target100In30DaysEnd16JanLeetCode.testCases;

import Target100In30DaysEnd16JanLeetCode.prefixSum.easy.AntOnTheBoundary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class AntOnTheBoundaryTest {

    AntOnTheBoundary ant = new AntOnTheBoundary();

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{2,3,-5},1),
                Arguments.of(new int[]{3,2,-3,-4},0),
                Arguments.of(new int[]{-9, 9, 6, -6},2),
                Arguments.of(new int[]{-10, 10, -7, -5},1),
                Arguments.of(new int[]{-10, 10, 8},1),
                Arguments.of(new int[]{-7,10},0)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void returnToBoundaryCount(int[] input,int output) {
        Assertions.assertEquals(ant.returnToBoundaryCount(input), output);
    }
}