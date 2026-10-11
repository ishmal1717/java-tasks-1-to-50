public class task21 {
    static int multCount = 0;

    public static double fastPower(double x, int n) {
        if (n == 0) return 1.0;
        if (n < 0) return 1.0 / fastPower(x, -n);

        if (n % 2 == 0) {
            multCount++; // Counting the multiplication for squaring the half result
            double half = fastPower(x, n / 2);
            return half * half;
        } else {
            multCount += 2; // Counting multiplications for x * power(x, n-1)
            return x * fastPower(x, n - 1);
        }
    }

    public static void main(String[] args) {
        multCount = 0;
        double result = fastPower(2.0, 30);
        System.out.println("2^30 = " + result);
        System.out.println("Total multiplications performed: " + multCount);
    }
}