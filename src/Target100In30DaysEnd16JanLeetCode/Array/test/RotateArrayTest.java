package Target100In30DaysEnd16JanLeetCode.Array.test;

import Target100In30DaysEnd16JanLeetCode.Array.RotateArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5,6,7},3,new int[]{5,6,7,1,2,3,4}),
                Arguments.of(new int[]{-1,-100,3,99},2,new int[]{3,99,-1,-100}),
                Arguments.of(new int[]{1},0,new int[]{1}),
                Arguments.of(new int[]{1},1,new int[]{1}),
                Arguments.of(new int[]{},0,new int[]{}),
                Arguments.of(new int[]{1,2,3},1,new int[]{3,1,2}),
                Arguments.of(new int[]{1,2},1,new int[]{2,1}),
                Arguments.of(new int[]{1,2},3,new int[]{2,1})
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void rotate(int[] input,int k,int[] output) {
        Assertions.assertArrayEquals(new RotateArray().rotate(input,k),output);
    }
}