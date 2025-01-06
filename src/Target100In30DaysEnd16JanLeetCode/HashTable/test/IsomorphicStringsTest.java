package Target100In30DaysEnd16JanLeetCode.HashTable.test;

import Target100In30DaysEnd16JanLeetCode.HashTable.IsomorphicStrings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of( "egg", "add",true),
                Arguments.of( "foo", "bar",false),
                Arguments.of( "paper", "title",true),
                Arguments.of( "badc", "baba",false)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void isIsomorphic(String s1, String s2,boolean output) {
        Assertions.assertEquals(new IsomorphicStrings().isIsomorphic(s1,s2),output);
    }
}