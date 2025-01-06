package Target100In30DaysEnd16JanLeetCode.HashTable.test;

import Target100In30DaysEnd16JanLeetCode.HashTable.HappyNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(19,true),
                Arguments.of(2,false)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void isHappy(int input,boolean output) {
        Assertions.assertEquals(new HappyNumber().isHappy(input),output);
    }
}