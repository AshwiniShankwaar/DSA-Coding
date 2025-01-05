package Target100In30DaysEnd16JanLeetCode.String.test;

import Target100In30DaysEnd16JanLeetCode.String.ValidParenthesis;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisTest {

    public static Stream<Arguments> testcases() {
        return Stream.of(
//                Arguments.of("()",true),
//                Arguments.of("()[]{}",true),
//                Arguments.of("(]",false),
//                Arguments.of("([])",true),
//                Arguments.of("",true),
//                Arguments.of("([])",true),
//                Arguments.of("]})",false),
                Arguments.of("()))",false),
                Arguments.of("((({[[",false),
                Arguments.of("(({{[[]]}}))",true),
                Arguments.of("({[)]}",false),
                Arguments.of("()()()()()",true),
                Arguments.of("((((((((((((((((((((()))))))))))))))))))))]",false),
                Arguments.of("(((((((((((((((((({{{{{{{{{{{{{{{{[[[[[[[[[[[[[[[[()]]]]]]]]]]]]]]]]}}}}}}}}}}}}}}}}))))))))))))))))))",true),
                Arguments.of("(((((((((((((((((({{{{{{{{{{{{{{{{[[[[[[[[[[[[[[[[()]]]]]]]]]]]]]]]]}}}}}}}}}}}}}}})))))",false),
                Arguments.of("()".repeat((int) Math.pow(10,5)),true),
                Arguments.of("(".repeat((int)Math.pow(10,5)) + ")".repeat ((int)Math.pow(10,5) - 1),false)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void isValid(String input,boolean output) {
        Assertions.assertEquals(new ValidParenthesis().isValid(input),output);
    }
}