public class task26 {
    public static void main(String[] args) {
        System.out.print("Armstrong numbers between 1 and 1000: ");
        for (int i = 1; i <= 1000; i++) {
            int sum = 0, temp = i;
            int digits = String.valueOf(i).length();

            while (temp > 0) {
                int d = temp % 10;
                sum += Math.pow(d, digits);
                temp /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}