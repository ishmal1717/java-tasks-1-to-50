public class task1 {
    public static void main(String[] args) {
        int n = 7;
        // Using bitwise AND operator
        if ((n & 1) == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }
}