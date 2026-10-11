public class task22 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        boolean isSymmetric = true;

        // Compute transpose and check symmetry
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                }
            }
        }

        // Print Transpose Matrix
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        // Report symmetry
        System.out.println("Is the matrix symmetric? " + isSymmetric);
    }
}