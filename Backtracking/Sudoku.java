class Sudoku {

    // Check if placing number n at board[row][col] is safe
    public boolean isSafe(char[][] board, int row, int col, int n) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (n + '0')) {
                return false;
            }
            if (board[row][i] == (char) (n + '0')) {
                return false;
            }
        }

        // Check 3x3 subgrid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (n + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    // Recursive backtracking helper
    public boolean helper(char[][] board, int row, int col) {
        // Base condition: reached beyond last row
        if (row == board.length) {
            return true;
        }

        int nrow, ncol;
        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if (board[row][col] != '_') { // already filled
            return helper(board, nrow, ncol);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');
                    if (helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        board[row][col] = '_'; // backtrack
                    }
                }
            }
            return false; // no number worked
        }
    }

    // Public method to solve Sudoku
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    // MAIN METHOD to test
    public static void main(String[] args) {
        // Example Sudoku board with '_' as empty cells
        char[][] board = {
                { '5', '3', '_', '_', '7', '_', '_', '_', '_' },
                { '6', '_', '_', '1', '9', '5', '_', '_', '_' },
                { '_', '9', '8', '_', '_', '_', '_', '6', '_' },
                { '8', '_', '_', '_', '6', '_', '_', '_', '3' },
                { '4', '_', '_', '8', '_', '3', '_', '_', '1' },
                { '7', '_', '_', '_', '2', '_', '_', '_', '6' },
                { '_', '6', '_', '_', '_', '_', '2', '8', '_' },
                { '_', '_', '_', '4', '1', '9', '_', '_', '5' },
                { '_', '_', '_', '_', '8', '_', '_', '7', '9' }
        };

        Sudoku solver = new Sudoku();
        solver.solveSudoku(board);

        // Print solved Sudoku
        System.out.println("Solved Sudoku:");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}


/*
Output :

Solved Sudoku:
5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9

*/