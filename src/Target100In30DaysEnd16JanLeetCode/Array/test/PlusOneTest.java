package Target100In30DaysEnd16JanLeetCode.Array.test;

import Target100In30DaysEnd16JanLeetCode.Array.PlusOne;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PlusOneTest {

    PlusOne po = new PlusOne();
    public static Stream<Arguments> testCase() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3},new int[]{1,2,4}),
                Arguments.of(new int[]{4,3,2,1},new int[]{4,3,2,2}),
                Arguments.of(new int[]{9},new int[]{1,0}),
                Arguments.of(new int[]{9,9,9,9,9,9,9,9},new int[]{1,0,0,0,0,0,0,0,0}),
                Arguments.of(new int[]{9,8,7,6,5,4,3,2,1,0},new int[]{9,8,7,6,5,4,3,2,1,1}),
                Arguments.of(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6},
                        new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,7})

        );
    }

    @ParameterizedTest
    @MethodSource("testCase")
    void plusOne(int[] input,int[] output) {
        Assertions.assertArrayEquals(po.plusOne(input),output);
    }
}