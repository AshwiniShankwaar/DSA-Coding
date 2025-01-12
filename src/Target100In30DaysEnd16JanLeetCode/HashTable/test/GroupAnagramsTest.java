package Target100In30DaysEnd16JanLeetCode.HashTable.test;

import Target100In30DaysEnd16JanLeetCode.HashTable.GroupAnagrams;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
          Arguments.of(
                  new String[]{"eat","tea","tan","ate","nat","bat"},
                  List.of(
                          List.of("bat"),
                          List.of("nat","tan"),
                          List.of("ate","eat","tea")
                  )
          ),
                Arguments.of(
                        new String[]{""},
                        List.of(
                                List.of("")
                        )
                ),
                Arguments.of(
                        new String[]{"a"},
                        List.of(
                                List.of("a")
                        )
                )

        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void groupAnagrams(String[] input,List<List<String>> output) {
        Assertions.assertIterableEquals(new GroupAnagrams().groupAnagrams(input),output);
    }
}