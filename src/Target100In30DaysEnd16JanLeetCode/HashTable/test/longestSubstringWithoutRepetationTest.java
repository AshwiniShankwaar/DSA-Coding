package Target100In30DaysEnd16JanLeetCode.HashTable.test;

import Target100In30DaysEnd16JanLeetCode.HashTable.LongestSubstringWithoutRepetation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepetationTest {

    public static Stream<Arguments> testCases() {

        return Stream.of(
                Arguments.of("abcabcbb",3),
                Arguments.of("bbbbb",1),
                Arguments.of("pwwkew",3),
                Arguments.of("au",2)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void lengthOfLongestSubstring(String input, int output) {
        Assertions.assertEquals(
                new LongestSubstringWithoutRepetation().lengthOfLongestSubstring(input),
                output);
    }
}