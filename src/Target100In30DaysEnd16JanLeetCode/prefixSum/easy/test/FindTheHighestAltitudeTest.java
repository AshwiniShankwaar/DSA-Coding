package Target100In30DaysEnd16JanLeetCode.prefixSum.easy.test;

import Target100In30DaysEnd16JanLeetCode.prefixSum.easy.FindTheHighestAltitude;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FindTheHighestAltitudeTest {

    FindTheHighestAltitude f = new FindTheHighestAltitude();
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{-5,1,5,0,-7},1),
                Arguments.of(new int[]{-4,-3,-2,-1,4,3,2},0)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void largestAltitude(int[] input,int output) {
        Assertions.assertEquals(f.largestAltitude(input),output);
    }
}