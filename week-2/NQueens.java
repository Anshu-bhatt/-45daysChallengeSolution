import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 4; // You can change this value for different board sizes
        List<List<String>> solutions = solveNQueens(n);
        for (List<String> solution : solutions) {
            printSolution(solution);
            System.out.println();
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];
        
        // Initialize the board with empty spaces
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        // Start backtracking from the first row
        solve(solutions, board, 0);
        return solutions;
    }

    private static void solve(List<List<String>> solutions, char[][] board, int row) {
        if (row == board.length) {
            solutions.add(construct(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                solve(solutions, board, row + 1);
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check diagonal (top-left)
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check diagonal (top-right)
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private static List<String> construct(char[][] board) {
        List<String> path = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            path.add(new String(board[i]));
        }
        return path;
    }

    private static void printSolution(List<String> solution) {
        for (String row : solution) {
            System.out.println(row);
        }
    }
}
