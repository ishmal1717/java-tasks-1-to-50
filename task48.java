public class task48 {
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[10];
            boolean[] colCheck = new boolean[10];
            boolean[] boxCheck = new boolean[10];

            for (int j = 0; j < 9; j++) {
                // Check Row
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    if (rowCheck[num]) return false;
                    rowCheck[num] = true;
                }

                // Check Column
                if (board[j][i] != '.') {
                    int num = board[j][i] - '0';
                    if (colCheck[num]) return false;
                    colCheck[num] = true;
                }

                // Check 3x3 Box
                int rowIndex = 3 * (i / 3) + j / 3;
                int colIndex = 3 * (i % 3) + j % 3;
                if (board[rowIndex][colIndex] != '.') {
                    int num = board[rowIndex][colIndex] - '0';
                    if (boxCheck[num]) return false;
                    boxCheck[num] = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] validBoard = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println("Is Sudoku valid? " + isValidSudoku(validBoard));
    }
}