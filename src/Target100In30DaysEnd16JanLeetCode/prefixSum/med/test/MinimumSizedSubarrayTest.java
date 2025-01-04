package Target100In30DaysEnd16JanLeetCode.prefixSum.med.test;

import Target100In30DaysEnd16JanLeetCode.prefixSum.med.MinimumSizedSubarray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MinimumSizedSubarrayTest {

    MinimumSizedSubarray m = new MinimumSizedSubarray();

    public static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.of(7,new int[]{2,3,1,2,4,3},2),
                Arguments.of(4,new int[]{1,4,4},1),
                Arguments.of(11,new int[]{1,1,1,1,1,1,1,1},0),
                Arguments.of(11,new int[]{1,2,3,4,5},3),
                Arguments.of(15,new int[]{1,2,3,4,5},5)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void minSubArrayLen(int target,int[] arr,int output) {
        Assertions.assertEquals(m.minSubArrayLen(target,arr),output);
    }
}