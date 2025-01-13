package Target100In30DaysEnd16JanLeetCode.HashTable.test;

import Target100In30DaysEnd16JanLeetCode.HashTable.ValidSudoku;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidSudokuTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(new String[][]{
                        {"5","3",".",".","7",".",".",".","."},
                        {"6",".",".","1","9","5",".",".","."},
                        {".","9","8",".",".",".",".","6","."},
                        {"8",".",".",".","6",".",".",".","3"},
                        {"4",".",".","8",".","3",".",".","1"},
                        {"7",".",".",".","2",".",".",".","6"},
                        {".","6",".",".",".",".","2","8","."},
                        {".",".",".","4","1","9",".",".","5"},
                        {".",".",".",".","8",".",".","7","9"}
                },true),
                Arguments.of(new String[][]{
                        {"5","3",".",".","7",".",".",".","."},
                        {"6",".",".","1","9","5",".",".","."},
                        {".","9","8",".",".",".",".","6","."},
                        {"8",".",".",".","6",".",".",".","3"},
                        {"4",".",".","8","5","3",".",".","1"},
                        {"7",".",".","5","2",".",".",".","6"},
                        {".","6",".",".",".",".","2","8","."},
                        {".",".",".","4","1","9",".",".","5"},
                        {".",".",".",".","8",".",".","7","9"}
                },false),
                Arguments.of(new String[][]{
                        {"8","3",".",".","7",".",".",".","."},
                        {"6",".",".","1","9","5",".",".","."},
                        {".","9","8",".",".",".",".","6","."},
                        {"8",".",".",".","6",".",".",".","3"},
                        {"4",".",".","8",".","3",".",".","1"},
                        {"7",".",".",".","2",".",".",".","6"},
                        {".","6",".",".",".",".","2","8","."},
                        {".",".",".","4","1","9",".",".","5"},
                        {".",".",".",".","8",".",".","7","9"}
                },false)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void isValidSudoku(String[][] input,boolean output) {
        char[][] i = new char[9][9];
        for(int j = 0; j < input.length;j++){
            for (int k = 0; k < input[j].length; k++) {
                char c = input[j][k].charAt(0);
                i[j][k] = c;
            }
        }
        Assertions.assertEquals(new ValidSudoku().isValidSudoku(i),output);
    }
}