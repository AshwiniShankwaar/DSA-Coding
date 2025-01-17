package Target100In30DaysEnd16JanLeetCode.HashTable.test;

import Target100In30DaysEnd16JanLeetCode.HashTable.FourSumII;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FourSumIITest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(
                        new int[]{1,2},
                        new int[]{-2,-1},
                        new int[]{-1,2},
                        new int[]{0,2},
                        2
                ),
                Arguments.of(
                        new int[]{0},
                        new int[]{0},
                        new int[]{0},
                        new int[]{0},
                        1
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void fourSumCount(int[] i1,int[] i2,int[] i3,int[] i4,int output) {
        Assertions.assertEquals(new FourSumII().fourSumCount(i1,i2,i3,i4),output);
    }
}