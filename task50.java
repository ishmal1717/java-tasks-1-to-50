public class task50 {
    public static void main(String[] args) {
        int[] res = new int[200];
        res[0] = 1;
        int len = 1;

        for (int i = 2; i <= 50; i++) {
            int carry = 0;
            for (int j = 0; j < len; j++) {
                int prod = res[j] * i + carry;
                res[j] = prod % 10;
                carry = prod / 10;
            }
            while (carry > 0) {
                res[len++] = carry % 10;
                carry /= 10;
            }
        }

        System.out.print("Factorial of 50: ");
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(res[i]);
        }
        System.out.println();
    }
}