package Target100In30DaysEnd16JanLeetCode.testCases;

import Target100In30DaysEnd16JanLeetCode.DominantIndex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class DominantIndexTest {

    DominantIndex di = new DominantIndex();
    public static Stream<Arguments> testCase() {
        return Stream.of(
                Arguments.of(new int[]{3,6,1,0},1),
                Arguments.of(new int[]{1,2,3,4},-1)

        );
    }

    @ParameterizedTest
    @MethodSource("testCase")
    void dominantIndex(int[] input,int output) {
        Assertions.assertEquals(di.dominantIndex(input),output);
    }
}