package Target100In30DaysLeetCode.testCases;

import Target100In30DaysLeetCode.PascalsTriangle;
import jdk.jfr.MemoryAddress;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class PascalsTriangleTest {

    PascalsTriangle pascalsTriangle = new PascalsTriangle();

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(5,List.of(
                        List.of(1),
                        List.of(1,1),
                        List.of(1,2,1),
                        List.of(1,3,3,1),
                        List.of(1,4,6,4,1)
                )),
                Arguments.of(6,List.of(
                        List.of(1),
                        List.of(1,1),
                        List.of(1,2,1),
                        List.of(1,3,3,1),
                        List.of(1,4,6,4,1),
                        List.of(1,5,10,10,5,1)
                )),
                Arguments.of(1,List.of(
                        List.of(1)
                ))

        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void generate(int input,List<List<Integer>> output){
        Assertions.assertIterableEquals(pascalsTriangle.generate(input),output);
    }
}
