package Target100In30DaysEnd16JanLeetCode.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(2,2),
                Arguments.of(3,3)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void climbStairs(int n, int o) {
        Assertions.assertEquals(new ClimbingStairs().climbStairs(n),o);
    }
}