package Target100In30DaysEnd16JanLeetCode.HashTable.test;

import Target100In30DaysEnd16JanLeetCode.HashTable.ContainDublicateII;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ContainDublicateIITest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,1},3,true),
                Arguments.of(new int[]{1,0,1,1},1,true),
                Arguments.of(new int[]{1,2,3,1,2,3},2,false),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 3, false),
                Arguments.of(new int[]{1, 1, 1, 1}, 2, true),
                Arguments.of(new int[]{99, 99}, 2, true),
                Arguments.of(new int[]{}, 1, false),
                Arguments.of(new int[]{1}, 1, false),
                Arguments.of(new int[]{1, 2, 1}, 0, false),
                Arguments.of(new int[]{1, 2, 3, 4, 1}, 4, true),
                Arguments.of(new int[]{1, 2, 3, 4, 1}, 3, false),
                Arguments.of(new int[]{1, 2, 3, 4, 2}, 3, true),
                Arguments.of(new int[]{2, 2}, 1, true),
                Arguments.of(new int[]{2, 3, 4, 5, 6, 2}, 5, true),
                Arguments.of(new int[]{2, 3, 4, 5, 6, 2}, 4, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void containsNearbyDuplicate(int[] arr,int k,boolean output) {
        Assertions.assertEquals(new ContainDublicateII().containsNearbyDuplicate(arr,k),output);
    }
}