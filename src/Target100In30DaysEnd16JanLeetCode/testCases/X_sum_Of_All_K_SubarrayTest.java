package Target100In30DaysEnd16JanLeetCode.testCases;

import Target100In30DaysEnd16JanLeetCode.slidingWindow.easy.X_sum_Of_All_K_Subarray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class X_sum_Of_All_K_SubarrayTest {

    X_sum_Of_All_K_Subarray xt = new X_sum_Of_All_K_Subarray();

    public static Stream<Arguments> testCases() {
        return Stream.of(
//                Arguments.of(
//                        new int[]{1,1,2,2,3,4,2,3},6,2,new int[]{6,10,12}
//                ),
//                Arguments.of(
//                        new int[]{3,8,7,8,7,5},2,2,new int[]{11,15,15,15,12}
//                ),
                Arguments.of(
                        new int[]{1,6,1,3,3,5,6,2,5},7,2,new int[]{18,18,16}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void findXSum(int[] nums,int k, int x,int[] output) {
        Assertions.assertArrayEquals(xt.findXSum(nums,k,x),output);
    }
}