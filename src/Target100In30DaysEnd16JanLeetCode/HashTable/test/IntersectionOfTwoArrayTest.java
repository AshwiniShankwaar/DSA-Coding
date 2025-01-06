package Target100In30DaysEnd16JanLeetCode.HashTable.test;

import Target100In30DaysEnd16JanLeetCode.HashTable.IntersectionOfTwoArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArrayTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
//                Arguments.of(new int[]{1,2,2,1},new int[]{2,2},new int[]{2}),
                Arguments.of(new int[]{4,9,5},new int[]{9,4,9,8,4},new int[]{9,4}),
                Arguments.of(new int[]{1,2,3},new int[]{4,6,3},new int[]{3})
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void intersection(int[] arr1,int[] arr2,int[] output) {
        Assertions.assertArrayEquals(new IntersectionOfTwoArray().intersection(arr1,arr2),output);
    }
}