package Target100In30DaysEnd16JanLeetCode.HashTable.test;

import Target100In30DaysEnd16JanLeetCode.HashTable.JewelsAndStones;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class JewelsAndStonesTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("aA","aAAbbbb",3),
                Arguments.of("z","ZZ",0)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void numJewelsInStones(String j,String s,int output) {
        Assertions.assertEquals(new JewelsAndStones().numJewelsInStones(j,s),output);
    }
}