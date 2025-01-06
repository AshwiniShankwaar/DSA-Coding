package Target100In30DaysEnd16JanLeetCode.HashTable.test;

import Target100In30DaysEnd16JanLeetCode.HashTable.MinimumIndexSumOfTwoLists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MinimumIndexSumOfTwoListsTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                        new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"},
                        new String[]{"Shogun"}),
                Arguments.of(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                        new String[]{"KFC","Shogun","Burger King"},
                        new String[]{"Shogun"}),
                Arguments.of(new String[]{"happy","sad","good"},
                        new String[]{"sad","happy","good"},
                        new String[]{"sad","happy"}),
                Arguments.of(new String[]{"S","TEXP","BK","KFC"},
                        new String[]{"KFC","BK","S"},
                        new String[]{"S"})
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void findRestaurant(String[] list1, String[] list2,String[] output) {
        Assertions.assertArrayEquals(
                new MinimumIndexSumOfTwoLists().findRestaurant(list1, list2),
                output);
    }
}