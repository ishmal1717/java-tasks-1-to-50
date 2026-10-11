public class task44 {
    static int solutionCount = 0;

    public static boolean isSafe(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            // Check if column conflicts or diagonal conflicts
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    public static void solveNQueens(int row, int n, int[] board) {
        if (row == n) {
            solutionCount++;
            if (solutionCount == 1) {
                System.out.println("Displaying one valid board configuration for N = 6 (Column positions per row):");
                for (int c : board) {
                    System.out.print(c + " ");
                }
                System.out.println("\n\nVisual Board Representation ('Q' = Queen, '.' = Empty):");
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
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row] = col;
                solveNQueens(row + 1, n, board);
            }
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int[] board = new int[n];
        solveNQueens(0, n, board);
        System.out.println("Total number of solutions for N = 6: " + solutionCount);
    }
}