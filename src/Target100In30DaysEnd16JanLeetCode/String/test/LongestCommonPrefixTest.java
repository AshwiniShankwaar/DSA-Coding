package Target100In30DaysEnd16JanLeetCode.String.test;

import Target100In30DaysEnd16JanLeetCode.String.LongestCommonPrefix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new String[]{"flower", "flow", "flight"}, "fl"), // Common prefix exists
                Arguments.of(new String[]{"dog", "racecar", "car"}, ""),      // No common prefix

                // Average Case
                Arguments.of(new String[]{"interview", "internet", "interval"}, "inte"), // Partial common prefix
                Arguments.of(new String[]{"apple", "ape", "april"}, "ap"),              // Common prefix of 2 characters

                // Worst Case
                Arguments.of(new String[]{"a", "a", "a"}, "a"),              // Single character repeated
                Arguments.of(new String[]{"", "b", "c"}, ""),                // Empty string in the array
                Arguments.of(new String[]{"abcdef", "abc", "abcd"}, "abc"),  // One string is the prefix of others
                Arguments.of(new String[]{"prefix", "suffix", "affix"}, ""), // No common prefix at all
                Arguments.of(new String[]{"aaaaaaaaaa", "aaaaa", "aaa"}, "aaa"), // Long repeated prefix
                Arguments.of(new String[]{"abcdefg", "abcdefh", "abcdefi"}, "abcdef") // Longest common prefix
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void longestCommonPrefix(String[] prefixes, String output) {
        Assertions.assertEquals(new LongestCommonPrefix().longestCommonPrefix(prefixes),output);
    }
}