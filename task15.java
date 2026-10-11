public class task15 {
    // Helper method to reverse a portion of the array in place
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k %= n; // Handle cases where k is larger than array length

        // 1. Reverse the first k elements
        reverse(arr, 0, k - 1);
        // 2. Reverse the remaining elements
        reverse(arr, k, n - 1);
        // 3. Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.print("Original Array: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        rotateLeft(arr, k);

        System.out.print("Rotated Left by " + k + ": ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }
}