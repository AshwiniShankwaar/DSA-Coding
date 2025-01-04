package Target100In30DaysEnd16JanLeetCode.prefixSum.med.test;

import Target100In30DaysEnd16JanLeetCode.prefixSum.med.RandomPickWithWeight;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RandomPickWithWeightTest {

    RandomPickWithWeight test;
    public static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.of(new int[]{3,14,1,7},new int[][]{{},{},{},{}})
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void pickIndex(int[] input,int[][] picks) {
        test = new RandomPickWithWeight(input);
        for (int i = 0; i < picks.length; i++) {
            System.out.println(test.pickIndex());
        }
    }
}