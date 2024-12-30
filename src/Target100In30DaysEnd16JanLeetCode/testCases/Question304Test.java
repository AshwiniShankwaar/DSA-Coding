package Target100In30DaysEnd16JanLeetCode.testCases;

import Target100In30DaysEnd16JanLeetCode.prefixSum.med.Question304;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Question304Test {

    public static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                {3, 0, 1, 4, 2},
                                {5, 6, 3, 2, 1},
                                {1, 2, 0, 1, 5},
                                {4, 1, 0, 1, 7},
                                {1, 0, 3, 0, 5}
                        },
                        new int[][]{
                                {2, 1, 4, 3},
                                {1, 1, 2, 2},
                                {1, 2, 2, 4}
                        },
                        new int[]{8, 11, 12}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void sumRegion(int[][] matrix, int[][] queries, int[] expected) {
        Question304 test = new Question304(matrix);
        int[] actual = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            actual[i] = test.sumRegion(queries[i][0], queries[i][1], queries[i][2], queries[i][3]);
        }

        assertArrayEquals(expected, actual, "The sumRegion results do not match the expected values.");
    }
}