public class Nqueens {
    public static boolean isSafe(char board[][], int row, int col) {
        // Check the vertical up
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check the diagonal left up
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the diagonal right up
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static boolean solveNQueens(char board[][], int row) {
        // Base case
        if (row == board.length) {
            printBoard(board);
            return true;
        }

        boolean result = false;

        // Column loop
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';

                // Recursively solve for the next row
                result = solveNQueens(board, row + 1) || result;

                // Backtrack
                board[row][col] = 'X';
            }
        }

        return result;
    }

    public static void printBoard(char board[][]) {
        System.out.println("--------ChessBoard----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];

        // Initialize the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        if (solveNQueens(board, 0)) {
            System.out.println("Solution is Possible");
        } else {
            System.out.println("Solution is not Possible");
        }
    }
}
