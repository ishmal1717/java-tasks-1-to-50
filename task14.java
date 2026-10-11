public class task14 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1, 35, 25, 30, 9};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.print("Array elements: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest value found.");
        } else {
            System.out.println("Second largest value: " + second);
        }
    }
}