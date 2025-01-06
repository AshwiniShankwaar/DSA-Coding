package Target100In30DaysEnd16JanLeetCode.twoPointer.test;

import Target100In30DaysEnd16JanLeetCode.twoPointer.easy.MaxConsecutiveOnes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest {

    public static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.of(new int[]{1,1,0,1,1,1},3),
                Arguments.of(new int[]{1,0,1,1,0,1},2),
                Arguments.of(new int[]{0,0,1,1,0,0},2),
                Arguments.of(new int[]{1,1,1,1,1,1},6),
                Arguments.of(new int[]{0,0,0,0,0,0},0)

        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void findMaxConsecutiveOnes(int[] nums,int output) {
        Assertions.assertEquals(new MaxConsecutiveOnes().findMaxConsecutiveOnes(nums),output);
    }
}