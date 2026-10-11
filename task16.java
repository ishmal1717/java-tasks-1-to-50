public class task16 {
    public static void printHollowDiamond(int n) {
        if (n % 2 == 0) {
            System.out.println("Error: n must be an odd number.");
            return;
        }

        int spaces = n / 2;
        int stars = 1;

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 0; j < Math.abs(spaces); j++) {
                System.out.print(" ");
            }

            // Print stars and hollow space
            for (int j = 0; j < stars; j++) {
                if (j == 0 || j == stars - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Adjust spaces and stars for upper/lower halves
            if (i <= n / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5; // Must be odd
        printHollowDiamond(n);
    }
}