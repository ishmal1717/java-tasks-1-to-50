public class task31 {
    public static void main(String[] args) {
        int n = 5;
        int[][] pascal = new int[n][];

        for (int i = 0; i < n; i++) {
            // Initialize jagged row length
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1; // First element is always 1
            pascal[i][i] = 1; // Last element is always 1

            // Compute intermediate values
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        // Print Pascal's Triangle
        System.out.println("Pascal's Triangle (" + n + " rows):");
        for (int i = 0; i < n; i++) {
            // Print leading spaces for alignment format
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}