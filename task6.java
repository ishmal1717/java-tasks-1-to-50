public class task6 {
    // Method to reverse and print integer digits, keeping trailing zeros
    public static void reverseDigits(int n) {
        System.out.print("Original: " + n + " -> Reversed: ");

        // Handle the edge case if the number is 0
        if (n == 0) {
            System.out.println(0);
            return;
        }

        // Loop to extract and print digits from right to left
        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            System.out.print(digit);
            n /= 10; // Remove the last digit
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test with normal input and trailing zeros edge case
        reverseDigits(1200);
        reverseDigits(45678);
        reverseDigits(0);
    }
}