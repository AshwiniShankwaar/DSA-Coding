package Target100In30DaysEnd16JanLeetCode.HashTable.test;

import Target100In30DaysEnd16JanLeetCode.HashTable.SingleNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{2,2,1},1),
                Arguments.of(new int[]{4,1,2,1,2},4),
                Arguments.of(new int[]{4,4,1,3,2,1,2},3),
                Arguments.of(new int[]{1},1)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void singleNumber(int[] nums,int output) {
        Assertions.assertEquals(new SingleNumber().singleNumber(nums),output);
    }
}