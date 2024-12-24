import java.util.HashSet;

public class SudokuValidator {
    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (isValidSudoku(board)) {
            System.out.println("The Sudoku board is valid.");
        } else {
            System.out.println("The Sudoku board is invalid.");
        }
    }

    private static boolean isValidSudoku(int[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Integer> rows = new HashSet<>();
            HashSet<Integer> cols = new HashSet<>();
            HashSet<Integer> cube = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                // Validate row
                if (board[i][j] != 0 && !rows.add(board[i][j])) return false;

                // Validate column
                if (board[j][i] != 0 && !cols.add(board[j][i])) return false;

                // Validate 3x3 sub-grid
                int rowIndex = 3 * (i / 3) + j / 3;
                int colIndex = 3 * (i % 3) + j % 3;
                if (board[rowIndex][colIndex] != 0 && !cube.add(board[rowIndex][colIndex])) return false;
            }
        }
        return true;
    }
}
