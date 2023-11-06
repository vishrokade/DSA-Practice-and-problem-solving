package DAA;

public class NQueens {
    public static void printBoard(int[] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isSafe(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    public static boolean solveNQueens(int[] board, int row) {
        int n = board.length;
        if (row == n) {
            printBoard(board);
            return true; // Found a solution
        }

        boolean foundSolution = false;

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row] = col;
                foundSolution = solveNQueens(board, row + 1) || foundSolution;
                board[row] = -1; // Backtrack
            }
        }

        return foundSolution;
    }

    public static void main(String[] args) {
        int n = 4; // Change this to the desired number of Queens
        int[] board = new int[n];
        for (int i = 0; i < n; i++) {
            board[i] = -1; // Initialize the board
        }

        if (!solveNQueens(board, 0)) {
            System.out.println("No solution found");
        }
    }
}
