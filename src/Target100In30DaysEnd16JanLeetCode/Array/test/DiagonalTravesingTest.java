package Target100In30DaysEnd16JanLeetCode.Array.test;

import Target100In30DaysEnd16JanLeetCode.Array.DiagonalTravesing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class DiagonalTravesingTest {

    DiagonalTravesing dt = new DiagonalTravesing();

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[][]{{1,2,3},{4,5,6},{7,8,9}},new int[]{1,2,4,7,5,3,6,8,9}),
                Arguments.of(new int[][]{{1,2},{3,4}},new int[]{1,2,3,4})
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void findDiagonalOrder(int[][] input,int[] out){
        Assertions.assertArrayEquals(dt.findDiagonalOrder(input),out);
    }
}
