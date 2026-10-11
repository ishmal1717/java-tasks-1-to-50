public class task3 {
    public static void main(String[] args) {
        int a = 15, b = 8, c = 22;
        int median = (a > b) ? (a < c ? a : (b > c ? b : c)) : (b < c ? b : (a > c ? a : c));
        System.out.println("Median: " + median);
    }
}