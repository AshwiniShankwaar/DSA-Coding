package Target100In30DaysEnd16JanLeetCode.String.test;

import Target100In30DaysEnd16JanLeetCode.String.ValidPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama",true),
                Arguments.of("race a car", false),
                Arguments.of(" ",true),
                Arguments.of("aa",true),
                Arguments.of("P0",false),
                Arguments.of("0P",false)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void isPalindrome(String i,boolean o) {
        Assertions.assertEquals(new ValidPalindrome().isPalindrome(i),o);
    }
}