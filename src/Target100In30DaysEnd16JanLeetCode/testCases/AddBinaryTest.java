package Target100In30DaysEnd16JanLeetCode.testCases;

import Target100In30DaysEnd16JanLeetCode.AddBinary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class AddBinaryTest {

    AddBinary addBinary = new AddBinary();

    public static Stream<Arguments> testCaases() {
        return Stream.of(
                Arguments.of("11","1","100"),
                Arguments.of("1010","1011","10101")
        );
    }

    @ParameterizedTest
    @MethodSource("testCaases")
    void addBinary(String input1,String input2,String output) {
        Assertions.assertEquals(addBinary.addBinary(input1,input2),output);
    }
}