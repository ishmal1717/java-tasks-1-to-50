public class task7 {
    public static int digitalRoot(int n) {
        System.out.println("Starting number: " + n);
        while (n >= 10) {
            int sum = 0;
            int temp = n;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            System.out.println("Intermediate sum: " + sum);
            n = sum;
        }
        return n;
    }

    public static void main(String[] args) {
        int number = 9875;
        int result = digitalRoot(number);
        System.out.println("Final single digit: " + result);
    }
}