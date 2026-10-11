public class task23 {
    // Recursive method to print binary
    public static void toBinaryRecursive(int n) {
        if (n > 1) {
            toBinaryRecursive(n / 2);
        }
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        int decimalNum = 43;

        // 1. Loop-based conversion
        String binaryLoop = "";
        int temp = decimalNum;
        if (temp == 0) {
            binaryLoop = "0";
        } else {
            while (temp > 0) {
                binaryLoop = (temp % 2) + binaryLoop;
                temp /= 2;
            }
        }
        System.out.println("Binary (using Loop): " + binaryLoop);

        // 2. Recursion-based conversion
        System.out.print("Binary (using Recursion): ");
        if (decimalNum == 0) {
            System.out.print(0);
        } else {
            toBinaryRecursive(decimalNum);
        }
        System.out.println();
    }
}