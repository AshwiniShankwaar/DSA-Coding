package Target100In30DaysEnd16JanLeetCode.testCases;

import Target100In30DaysEnd16JanLeetCode.LongestSubsequenceWithLimitedSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubsequenceWithLimitedSumTest {

    LongestSubsequenceWithLimitedSum test = new LongestSubsequenceWithLimitedSum();

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{4,5,2,1},new int[]{3,10,21},new int[]{2,3,4}),
                Arguments.of(new int[]{2,3,4,5},new int[]{1},new int[]{0})
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void answerQueries(int[] nums,int[] queries,int[] output) {
        Assertions.assertArrayEquals(test.answerQueries(nums,queries),output);
    }
}