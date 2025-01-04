package Target100In30DaysEnd16JanLeetCode.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Question
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it
 * */
public class PascalsTriangle {
    /**
     * This method return a list of lists of integers which represent pascals triangle
     *
     * @param numRows the number of rows you want to print
     * @return a list of lists of integers which represent pascals triangle
     * */
    public List<List<Integer>> generate(int numRows) {
        List<Integer> pre = new ArrayList<>();
        pre.add(1);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i < numRows; i++) {
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int j = 1; j < i; j++) {
                int k = pre.get(j-1)+pre.get(j);
                cur.add(k);
            }
            cur.add(1);
            result.add(pre);
            pre = cur;
        }
        result.add(pre);
        return result;
    }
}
