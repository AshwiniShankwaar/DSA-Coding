package Target100In30DaysEnd16JanLeetCode.prefixSum.med.test;

import Target100In30DaysEnd16JanLeetCode.prefixSum.med.ShiftingLetter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ShiftingLetterTest {

    ShiftingLetter test = new ShiftingLetter();

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("abc", new int[]{3, 5, 9}, "rpl"),
                Arguments.of("aaa", new int[]{1, 2, 3}, "gfd"),
                Arguments.of("bad", new int[]{10,20,30}, "jyh"),
                Arguments.of("z", new int[]{52}, "z"),
                Arguments.of("ruu", new int[]{26,9,17}, "rul")
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void shiftingLetters(String input, int[] shifts, String output) {
        Assertions.assertEquals(test.shiftingLetters(input,shifts), output);
    }
}