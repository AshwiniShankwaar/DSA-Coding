package Target100In30DaysLeetCode.testCases;

import Target100In30DaysLeetCode.KthLargestElementOfArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementOfArrayTest {

    KthLargestElementOfArray kth = new KthLargestElementOfArray();

    public static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.of(new int[]{3,2,1,5,6,4},2,5),
                Arguments.of(new int[]{3,2,3,1,2,4,5,5,6},4,4)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void findKthLargest(int[] input,int k, int output) {
        Assertions.assertEquals(kth.findKthLargest(input, k),output);
    }
}