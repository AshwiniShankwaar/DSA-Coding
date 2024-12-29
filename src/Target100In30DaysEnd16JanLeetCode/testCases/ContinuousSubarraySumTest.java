package Target100In30DaysEnd16JanLeetCode.testCases;

import Target100In30DaysEnd16JanLeetCode.prefixSum.med.ContinuousSubarraySum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ContinuousSubarraySumTest {

    ContinuousSubarraySum subarraySum = new ContinuousSubarraySum();
    public static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.of(new int[]{23,2,4,6,7},6,true),
                Arguments.of(new int[]{23,2,6,4,7},6,true),
                Arguments.of(new int[]{23,2,6,4,7},13,false),
                Arguments.of(new int[]{1,0},2,false),
                Arguments.of(new int[]{5,0,0,0},3,true)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void checkSubarraySum(int[] arr,int k,boolean output) {
        Assertions.assertEquals(subarraySum.checkSubarraySum(arr,k), output);
    }
}