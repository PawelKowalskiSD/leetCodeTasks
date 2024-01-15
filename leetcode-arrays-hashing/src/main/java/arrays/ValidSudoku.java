package arrays;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> cols;
        Set<Character> rows;

        for (int i = 0; i < 9; i++) {
            rows = new HashSet<>();
            cols = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char row = board[i][j];
                char col = board[j][i];
                if (row != '.') {
                    if (rows.contains(row)) {
                        return false;
                    } else
                        rows.add(row);
                }
                if (col != '.') {
                    if (cols.contains(col)) {
                        return false;
                    } else
                        cols.add(col);
                }
            }
        }
        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                if (!sqr(i, j, board))
                    return false;
            }
        }
        return true;
    }

    private boolean sqr(int rows, int cols, char[][] board) {
        Set<Character> square = new HashSet<>();
        int col = cols + 3;
        int row = rows + 3;

        for (int i = rows; i < row; i++) {
            for (int j = cols; j < col; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (square.contains(board[i][j]))
                    return false;
                square.add(board[i][j]);
            }
        }
        return true;
    }
}
