package Target100In30DaysEnd16JanLeetCode.String.test;

import Prepration.String.KMPAlgo;
import Target100In30DaysEnd16JanLeetCode.String.ImplementStrStr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ImplementStrStrTest {

    ImplementStrStr test = new ImplementStrStr();
    KMPAlgo kmpAlgo = new KMPAlgo();
    public static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.of("sadbutsad","sad",0),
                Arguments.of("abxabcabcaby","abcaby",6),
                Arguments.of("leetcode","leeto",-1),
                Arguments.of("mississippi","issip",4)
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void strStr(String haystack,String needle,int output) {
//        Assertions.assertEquals(test.strStr(haystack, needle),output);
        Assertions.assertEquals(kmpAlgo.algo(haystack, needle),output);
    }
}