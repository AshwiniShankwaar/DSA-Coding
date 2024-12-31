package Target100In30DaysEnd16JanLeetCode.testCases;

import Target100In30DaysEnd16JanLeetCode.prefixSum.med.RandomPointInNonOverloppingRectangle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RandomPointInNonOverloppingRectangleTest {

    RandomPointInNonOverloppingRectangle test;

    public static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{-2, -2, 1, 1},{2, 2, 4, 6}},
                        new int[][]{
                                {},
                                {},
                                {},
                                {},
                                {}
                        }

                )
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void pick(int[][] rects,int[][] picks) {
        test = new RandomPointInNonOverloppingRectangle(rects);
        for(int i=0;i< picks.length;i++){
            int[] pick = test.pick();
            picks[i] = pick;
        }
        for(int[] pick:picks){
            System.out.println("["+pick[0]+","+pick[1]+"]");
        }
    }
}