package Target100In30DaysEnd16JanLeetCode.Array.test;

import Target100In30DaysEnd16JanLeetCode.Array.SpiralMatrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SpiralMatrixTest {

    SpiralMatrix sm = new SpiralMatrix();
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}},List.of(1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10)),
                Arguments.of(new int[][]{{1,2,3},{4,5,6},{7,8,9}},List.of(1,2,3,6,9,8,7,4,5)),
                Arguments.of(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}},List.of(1,2,3,4,8,12,11,10,9,5,6,7))
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void spiralOrder(int[][] input, List<Integer> output) {
        Assertions.assertIterableEquals(sm.spiralOrder(input),output);
    }
}