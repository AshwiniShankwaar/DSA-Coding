package Target100In30DaysEnd16JanLeetCode.prefixSum.med.test;

import Target100In30DaysEnd16JanLeetCode.prefixSum.med.SubarraySumEqualsK;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SubarraySumEqualsKTest {

    SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1,1,1},2,2),
                Arguments.of(new int[]{1,2,3},3,2)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void subarraySum(int[] array, int k,int output) {
        Assertions.assertEquals(
                subarraySumEqualsK.subarraySum(array,k),
                output
        );
    }
}