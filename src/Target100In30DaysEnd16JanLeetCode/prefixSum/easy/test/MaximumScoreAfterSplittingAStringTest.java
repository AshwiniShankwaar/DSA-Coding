package Target100In30DaysEnd16JanLeetCode.prefixSum.easy.test;

import Target100In30DaysEnd16JanLeetCode.prefixSum.easy.MaximumScoreAfterSplittingAString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MaximumScoreAfterSplittingAStringTest {

    MaximumScoreAfterSplittingAString score = new MaximumScoreAfterSplittingAString();

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("011101",5),
                Arguments.of("00111",5),
                Arguments.of("1111",3)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void maxScore(String input,int output) {
        Assertions.assertEquals(score.maxScore(input),output);
    }
}