package Target100In30DaysEnd16JanLeetCode.prefixSum.easy.test;

import Target100In30DaysEnd16JanLeetCode.prefixSum.easy.PointsInteractWithCars;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PointsInteractWithCarsTest {

    PointsInteractWithCars test = new PointsInteractWithCars();

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(List.of(List.of(3,6),List.of(1,5),List.of(4,7)),7),
                Arguments.of(List.of(List.of(1,3),List.of(5,8)),7)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void numberOfPoints(List<List<Integer>> nums,int output) {
        Assertions.assertEquals(test.numberOfPoints(nums),output);
    }
}