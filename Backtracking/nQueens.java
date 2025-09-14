public class nQueens {

    // Function to print the board
    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Check if placing queen at board[row][col] is safe
    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // Solve N-Queens using backtracking
    public static void solveNQueens(char[][] board, int row) {
        int n = board.length;

        // Base case: all queens placed
        if (row == n) {
            printBoard(board);
            return;
        }

        // Try placing queen in each column of this row
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                // Place queen
                board[row][col] = 'Q';
                // Recurse for next row
                solveNQueens(board, row + 1);
                // Backtrack (remove queen)
                board[row][col] = '.';
            }
        }
    }

    public static void main(String[] args) {
        int n = 4; 
        char[][] board = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        System.out.println("Solutions for " + n + "-Queens:");
        solveNQueens(board, 0);
    }
}
