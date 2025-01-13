package Target100In30DaysEnd16JanLeetCode.HashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.HashMap;

/**
 *Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according
 * to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 *
 * Note:
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 * */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        //optimised
        HashSet<Character>[] row=new HashSet[9];
        HashSet<Character>[] cols=new HashSet[9];
        HashSet<Character>[] boxes=new HashSet[9];

        for(int i=0;i<9;i++){
            row[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char val=board[i][j];

                if(val=='.') continue;

                if(row[i].contains(val)) return false;
                row[i].add(val);

                if(cols[j].contains(val)) return false;
                cols[j].add(val);


                int f=(i/3)*3+(j/3);

                if(boxes[f].contains(val)) return false;
                boxes[f].add(val);

            }
        }
        return true;

//        HashSet<List<Character>> row = new HashSet<List<Character>>();
//        boolean result = true;
//        for (int i = 0; i <9; i++) {
//            List<Character> l = new ArrayList<Character>();
//            for (int j = 0; j < 9; j++) {
//                if(board[i][j] != '.' && l.contains(board[i][j])){
//                    return false;
//                } else if (board[i][j] != '.') {
//                    l.add(board[i][j]);
//                }
//            }
//            row.add(l);
//        }
//        HashSet<List<Character>> col = new HashSet<List<Character>>();
//        for (int i = 0; i < 9; i++) {
//            List<Character> l = new ArrayList<Character>();
//            for (int j = 0; j < 9; j++) {
//                if(board[j][i] != '.' && l.contains(board[j][i])){
//                    return false;
//                } else if (board[j][i] != '.') {
//                    l.add(board[j][i]);
//                }
//            }
//            col.add(l);
//        }
//        HashMap<String,List<Character>> rowcol = new HashMap<String,List<Character>>();
//        for (int i = 0; i < board.length; i++) {
//
//            for (int j = 0; j < board[i].length; j++) {
//                char c = board[i][j];
//                int xindex = i/3;
//                int yindex = j/3;
//                String key = String.valueOf(xindex)+String.valueOf(yindex);
//                if(c != '.' && rowcol.keySet().contains(key)){
//                    List<Character> l = rowcol.get(key);
//                    if(l.contains(c)){
//                        return false;
//                    }l.add(c);
//                } else if (c != '.') {
//                    List<Character> r = new ArrayList<>();
//                    r.add(c);
//                    rowcol.put(key,r);
//                }
//            }
//        }
//        return result;
    }
}
