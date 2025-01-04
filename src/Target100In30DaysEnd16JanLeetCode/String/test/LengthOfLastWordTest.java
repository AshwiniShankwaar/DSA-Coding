package Target100In30DaysEnd16JanLeetCode.String.test;

import Target100In30DaysEnd16JanLeetCode.String.LengthOfLastWord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    LengthOfLastWord test = new LengthOfLastWord();
    public static Stream<Arguments> testCases() {
        return Stream.of(
               Arguments.of("Hello World",5),
                Arguments.of("   fly me   to   the moon  ",4),
                Arguments.of("luffy is still joyboy",6)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void lengthOfLastWord(String s,int output) {
        Assertions.assertEquals(test.lengthOfLastWord(s),output);
    }
}