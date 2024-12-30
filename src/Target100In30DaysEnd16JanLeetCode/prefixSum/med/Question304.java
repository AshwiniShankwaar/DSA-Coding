package Target100In30DaysEnd16JanLeetCode.prefixSum.med;
/**
 * Given a 2D matrix matrix, handle multiple queries of the following type:
 *
 * Calculate the sum of the elements of matrix inside the rectangle defined by its upper left
 * corner (row1, col1) and lower right corner (row2, col2).
 * Implement the NumMatrix class:
 *
 * NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
 * int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the elements of
 * matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right
 * corner (row2, col2).
 * You must design an algorithm where sumRegion works on O(1) time complexity
 * */
public class Question304 {
//    int[][] prefixsum;
int[][] matSum;
    public Question304(int[][] matrix){
        if(matrix == null || matrix[0].length == 0) return;
        int ROWS = matrix.length;
        int COLS = matrix[0].length;
        matSum = new int[ROWS + 1][ COLS + 1];
        for(int i = 0 ; i < ROWS ; i++){
            int prefix = 0;
            for(int j = 0 ; j < COLS ; j++){
                prefix += matrix[i][j];
                matSum[i+1][j+1] = matSum[i][j+1]  //above
                        + prefix; //current
            }
        }
        //my logic
//        prefixsum = new int[matrix.length][matrix[0].length];
//        for(int i=0; i<matrix.length;i++){
//            prefixsum[i][0] = matrix[i][0];
//            for (int j = 1; j < matrix[i].length; j++) {
//                prefixsum[i][j] = prefixsum[i][j-1]+matrix[i][j];
//            }
//        }
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++; col1++; row2++; col2++;
        int allInclusive = matSum[row2][col2];
        int above = matSum[row1-1][col2];
        int left = matSum[row2][col1-1];
        int subtractedTwice = matSum[row1-1][col1-1];

        return allInclusive - above - left + subtractedTwice;
        //my logic
//        int sum = 0;
//        for(int i=row1; i<=row2;i++){
//            int right = prefixsum[i][col2];
//            int left = col1>0?prefixsum[i][col1-1]:0;
//            sum+=(right-left);
//        }
//        return sum;
    }
}
