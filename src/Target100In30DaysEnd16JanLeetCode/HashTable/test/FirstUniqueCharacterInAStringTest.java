package Target100In30DaysEnd16JanLeetCode.HashTable.test;

import Target100In30DaysEnd16JanLeetCode.HashTable.FirstUniqueCharacterInAString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInAStringTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("leetcode",0),
                Arguments.of("loveleetcode",2),
                Arguments.of("aabb",-1)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void firstUniqChar(String s,int output) {
        Assertions.assertEquals(new FirstUniqueCharacterInAString().firstUniqChar(s),output);
    }
}