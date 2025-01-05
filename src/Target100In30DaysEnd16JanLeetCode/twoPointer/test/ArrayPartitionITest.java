package Target100In30DaysEnd16JanLeetCode.twoPointer.test;

import Target100In30DaysEnd16JanLeetCode.twoPointer.easy.ArrayPartitionI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPartitionITest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1,4,3,2},4),
                Arguments.of(new int[]{6,2,6,5,1,2},9)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void arrayPairSum(int[] input,int output) {
        Assertions.assertEquals(new ArrayPartitionI().arrayPairSum(input), output);
    }
}