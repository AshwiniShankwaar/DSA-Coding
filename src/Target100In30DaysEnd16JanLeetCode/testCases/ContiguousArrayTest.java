package Target100In30DaysEnd16JanLeetCode.testCases;

import Target100In30DaysEnd16JanLeetCode.prefixSum.med.ContiguousArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ContiguousArrayTest {

    ContiguousArray test = new ContiguousArray();

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{0,1,1,0,1,1,1,0},4),
                Arguments.of(new int[]{0,1},2),
                Arguments.of(new int[]{0,1,0},2),
                Arguments.of(new int[]{0,1,0,1},4),
                Arguments.of(new int[]{1, 1, 0, 0, 1, 0},6),
                Arguments.of(new int[]{1, 0, 1, 1, 0, 0, 1},6),
                Arguments.of(new int[]{1, 1, 1, 1},0),
                Arguments.of(new int[]{0, 1, 1, 0, 1, 0, 0, 1},8),
                Arguments.of(new int[]{0, 1, 0, 1, 0, 1, 1},6),
                Arguments.of(new int[]{1, 0, 0, 1, 0, 1, 1, 0, 1},8),
                Arguments.of(new int[]{1},0),
                Arguments.of(new int[]{0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1},10),
                Arguments.of(new int[]{0, 0, 1, 1, 0},4)

        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void findMaxLength(int[] input, int output) {
        Assertions.assertEquals(test.findMaxLength(input),output);
    }
}