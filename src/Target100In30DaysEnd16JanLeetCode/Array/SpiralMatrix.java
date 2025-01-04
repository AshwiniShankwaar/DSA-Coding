package Target100In30DaysEnd16JanLeetCode.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 * */
public class SpiralMatrix {
    /**
     * this method return a list of integer that contain element in spiral traver
     * */
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0,right = matrix[0].length-1,left = 0,down=matrix.length-1;
        List<Integer> out = new ArrayList<Integer>();
        int dir = 0;
        while (top<= down && left<=right){
            
            if(dir == 0){
                for (int i = top; i <= right; i++) {
                    out.add(matrix[top][i]);
                }
                top+=1;
            } else if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    out.add(matrix[i][right]);
                }
                right-=1;
            } else if (dir == 2) {
                for (int i = right; i >= left ; i--) {
                    out.add(matrix[down][i]);
                }
                down-=1;
            } else if (dir==3) {
                for (int i = down; i >= top; i--) {
                    out.add(matrix[i][left]);
                }
                left+=1;
            }

            dir = (dir+1)%4;
        }
         return out;
    }
}
