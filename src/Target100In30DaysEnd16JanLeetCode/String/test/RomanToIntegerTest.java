package Target100In30DaysEnd16JanLeetCode.String.test;

import Target100In30DaysEnd16JanLeetCode.String.RomanToInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
//                Arguments.of("III",3),
//                Arguments.of("LVIII",58),
                Arguments.of("MCMXCIV",1994)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void romanToInt(String input,int output) {
        Assertions.assertEquals(new RomanToInteger().romanToInt(input), output);
    }
}