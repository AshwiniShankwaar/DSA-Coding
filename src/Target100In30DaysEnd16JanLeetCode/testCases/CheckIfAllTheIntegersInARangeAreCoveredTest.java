package Target100In30DaysEnd16JanLeetCode.testCases;

import Target100In30DaysEnd16JanLeetCode.prefixSum.easy.CheckIfAllTheIntegersInARangeAreCovered;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CheckIfAllTheIntegersInARangeAreCoveredTest {

    CheckIfAllTheIntegersInARangeAreCovered test = new CheckIfAllTheIntegersInARangeAreCovered();

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[][]{{1,2},{3,4},{5,6}},2,5,true),
                Arguments.of(new int[][]{{37,49},{5,17},{8,32}},29,49,false),
                Arguments.of(new int[][]{{1,10},{10,20}},21,21,false),
                Arguments.of(new int[][]{{1,50}},1,50,true),
                Arguments.of(new int[][]{{1,30}},1,50,false)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void isCovered(int[][] ranges, int left, int right,boolean output) {
        Assertions.assertEquals(test.isCovered(ranges, left, right), output);
    }
}