package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seenSet = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    if (!seenSet.add(board[i][j] + " in a row " + i) ||
                            !seenSet.add(board[i][j] + " in a column " + j) ||
                            !seenSet.add(board[i][j] + " in a sub box " + i / 3 + " " + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
