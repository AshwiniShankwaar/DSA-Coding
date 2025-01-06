package Target100In30DaysEnd16JanLeetCode.String.test;

import Target100In30DaysEnd16JanLeetCode.String.ReverseWordsInAString;
import Target100In30DaysEnd16JanLeetCode.String.ReverseWordsInAStringIII;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringTest {

    public static Stream<Arguments> testcases() {
        return Stream.of(
//                Arguments.of("the sky is blue","blue is sky the"),
//                Arguments.of("  hello world  ","world hello"),
//                Arguments.of("a good   example","example good a")
                Arguments.of("Let's take LeetCode contest","s'teL ekat edoCteeL tsetnoc"),
                Arguments.of("Mr Ding","rM gniD")
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void reverseWords(String input,String output) {
//        Assertions.assertEquals(new ReverseWordsInAString().reverseWords(input),output);
        Assertions.assertEquals(new ReverseWordsInAStringIII().reverseWords(input),output);
    }
}