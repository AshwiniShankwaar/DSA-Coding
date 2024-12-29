package Target100In30DaysEnd16JanLeetCode.testCases;

import Target100In30DaysEnd16JanLeetCode.PascalsTriangle;
import Target100In30DaysEnd16JanLeetCode.prefixSum.easy.PivotIndex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class PivotIndexTest {
    PivotIndex pi = new PivotIndex();

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1,7,3,6,5,6},3),
                Arguments.of(new int[]{1,2,3},-1),
                Arguments.of(new int[]{2,-1,1},0)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")//paramaterized tests
    //@Test for normal test
    void pivotIndex(int[] input,int output) {
        Assertions.assertEquals(pi.pivotIndex(input),output);
    }

    static class PascalsTriangleTest {

        PascalsTriangle pascalsTriangle = new PascalsTriangle();

        public static Stream<Arguments> testcases() {
            return Stream.of(
                    Arguments.of(5, List.of(
                            List.of(1),
                            List.of(1,1),
                            List.of(1,2,1),
                            List.of(1,3,3,1),
                            List.of(1,4,6,4,1)
                    )),
                    Arguments.of(1,List.of(
                            List.of(1)
                    )),
                    Arguments.of(6,List.of(
                            List.of(1),
                            List.of(1,1),
                            List.of(1,2,1),
                            List.of(1,3,3,1),
                            List.of(1,4,6,4,1),
                            List.of(1,5,10,10,5,1)
                    ))
            );
        }

        @ParameterizedTest
        @MethodSource("testcases")
        void generate(int input, List<List<Integer>> output) {
            Assertions.assertIterableEquals(pascalsTriangle.generate(input),output );
        }
    }
}