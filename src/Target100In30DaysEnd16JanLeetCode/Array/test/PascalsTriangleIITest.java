package Target100In30DaysEnd16JanLeetCode.Array.test;

import Target100In30DaysEnd16JanLeetCode.Array.PascalsTriangleII;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleIITest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
//                Arguments.of(0, List.of(1)),
                Arguments.of(1, List.of(1,1)),
                Arguments.of(2, List.of(1,2,1)),
                Arguments.of(3, List.of(1,3,3,1)),
                Arguments.of(4, List.of(1,4,6,4,1)),
                Arguments.of(5, List.of(1,5,10,10,5,1)),
                Arguments.of(6, List.of(1,6,15,20,15,6,1))

        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void getRow(int input,List<Integer> output) {
        Assertions.assertIterableEquals(new PascalsTriangleII().getRow(input),output);
    }
}