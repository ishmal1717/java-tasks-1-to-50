public class task35 {
    public static int findFirstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        int steps = 0;

        while (low <= high) {
            steps++;
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                high = mid - 1; // Continue searching on the left side for first occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Steps taken: " + steps);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5, 6, 8, 9};
        int target = 4;

        System.out.print("Array: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println("\nSearching for target: " + target);

        int index = findFirstOccurrence(arr, target);
        System.out.println("First occurrence index: " + index);
    }
}