public class task11 {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("First " + n + " Fibonacci numbers: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10; // User-given N
        printFibonacci(n);
    }
}