package Target100In30DaysEnd16JanLeetCode.prefixSum.easy.test;

import Target100In30DaysEnd16JanLeetCode.prefixSum.easy.MinimumPositiveSubArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class MinimumPositiveSubArrayTest {

    MinimumPositiveSubArray m = new MinimumPositiveSubArray();
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(List.of(3, -2, 1, 4),2,3,1),
                Arguments.of(List.of(-2, 2, -3, 1),2,3,-1),
                Arguments.of(List.of(1, 2, 3, 4),2,4,3),
                Arguments.of(List.of(4,-10),1,1,4)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void minimumSumSubarray(List<Integer> list,int l,int r,int out) {
        Assertions.assertEquals(m.minimumSumSubarray(list,l,r),out);
    }
}