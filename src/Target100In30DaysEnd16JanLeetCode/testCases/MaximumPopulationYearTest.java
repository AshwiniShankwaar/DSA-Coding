package Target100In30DaysEnd16JanLeetCode.testCases;

import Target100In30DaysEnd16JanLeetCode.prefixSum.easy.MaximumPopulationYear;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaximumPopulationYearTest {

    MaximumPopulationYear test = new MaximumPopulationYear();

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new int[][]{{1993,1999},{2000,2010}},1993),
                Arguments.of(new int[][]{{1950,1961},{1960,1971},{1970,1981}},1960),
//                Arguments.of(new int[][]{ {1900, 1950}, {1910, 1940}, {1920, 1935}},1920),
                Arguments.of(new int[][]{{2033,2034},{2039,2047},{1998,2042},{2047,2048},
                        {2025,2029},{2005,2044},{1990,1992},{1952,1956},{1984,2014}},2005),
                Arguments.of(new int[][]{{2017,2038},{2001,2013},{2032,2044},
                        {1978,2031},{1950,1973},{2043,2045},{2028,2049},{1979,2042},{2037,2048},{2048,2049},
                        {1980,2021},{2047,2050},{1985,2014},{2028,2031},{1989,2009},{1956,1966},{2014,2043},
                        {1993,2029},{1970,2036},{2013,2044}},2028)

        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void maximumPopulation(int[][] logs,int output) {
        Assertions.assertEquals(test.maximumPopulation(logs),output);
    }
}