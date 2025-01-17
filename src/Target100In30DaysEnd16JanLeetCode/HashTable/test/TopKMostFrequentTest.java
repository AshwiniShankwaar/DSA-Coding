package Target100In30DaysEnd16JanLeetCode.HashTable.test;

import Target100In30DaysEnd16JanLeetCode.HashTable.TopKMostFrequent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TopKMostFrequentTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1,1,1,2,2,3},2,new int[]{1,2}),
                Arguments.of(new int[]{4,1,-1,2,-1,2,3},2,new int[]{-1,2}),
                Arguments.of(new int[1],1,new int[1])
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void topKFrequent(int[] nums,int k,int[] output) {
        Assertions.assertArrayEquals(new TopKMostFrequent().topKFrequent(nums,k),output);
    }
}