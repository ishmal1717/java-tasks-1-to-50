public class task5 {
    // Method to print the number triangle
    public static void printNumberTriangle(int n) {
        System.out.println("Number Triangle for n = " + n + ":");

        // Outer loop controls the row number (i) from 1 to n
        for (int i = 1; i <= n; i++) {

            // Inner loop prints the digit 'i' exactly 'i' times in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            // Move to the next line after each row is complete
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test with n = 5
        int n = 5;
        printNumberTriangle(n);
    }
}