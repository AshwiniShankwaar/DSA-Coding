package Target100In30DaysEnd16JanLeetCode.BitManupulation.test;

import Target100In30DaysEnd16JanLeetCode.BitManupulation.NumbersOf1sBits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class NumbersOf1sBitsTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(11,3),
                Arguments.of(128,1),
                Arguments.of(2147483645,30)

        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void hammingWeight(int n,int output) {
        Assertions.assertEquals(new NumbersOf1sBits().hammingWeight(n),output);
    }
}