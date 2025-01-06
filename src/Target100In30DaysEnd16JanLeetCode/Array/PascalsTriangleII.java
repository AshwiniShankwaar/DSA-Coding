package Target100In30DaysEnd16JanLeetCode.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 * */
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<Integer>();
        pre.add(1);
        for (int i = 1; i < rowIndex+1; i++) {
            List<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            for(int j = 1; j <i;j++){
                cur.add(pre.get(j)+pre.get(j-1));
            }
            cur.add(1);
            pre = cur;
        }
        return pre;
    }
}
