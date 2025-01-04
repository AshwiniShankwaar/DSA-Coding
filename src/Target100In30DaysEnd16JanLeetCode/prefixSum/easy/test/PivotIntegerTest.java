package Target100In30DaysEnd16JanLeetCode.prefixSum.easy.test;

import Target100In30DaysEnd16JanLeetCode.prefixSum.easy.PivotInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PivotIntegerTest {

    PivotInteger pi = new PivotInteger();

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(8,6),
                Arguments.of(1,1),
                Arguments.of(4,-1)

        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void pivotInteger(int input,int output){
        Assertions.assertEquals(pi.pivotInteger(input),output);
    }
}