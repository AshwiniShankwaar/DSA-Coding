package Target100In30DaysEnd16JanLeetCode.Array;
/**
 * Question:
 * Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
 * */
public class DiagonalTravesing {
    /**
     * this method return an array of element traversed in a diagonal order on a 2d array
     *
     * @param mat 2d array of integers
     * @return array of elements travers the diagonal order
     * */
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length==0) return new int[]{};
        int rows = mat.length,columns = mat[0].length;
        boolean up = true;
        int[] array = new int[rows*columns];
        int m = 0,n = 0,i = 0;
        while(m<rows && n<columns) {
            if(up){
                while(m>0 && n<columns-1){
                    array[i++] = mat[m][n];
                    m--;
                    n++;
                }
                array[i++] = mat[m][n];
                if(n == columns-1){
                    m++;
                }else{
                    n++;
                }
            }else{
                while(m<rows-1 && n>0){
                    array[i++] = mat[m][n];
                    m++;
                    n--;
                }
                array[i++] = mat[m][n];
                if(m == rows-1){
                    n++;
                }else{
                    m++;
                }
            }
            up = !up;
        }
        return array;
    }
}
