public class task42 {
    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        // Merge elements in O(n + m) time
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }

        // Copy remaining elements of array a, if any
        while (i < a.length) {
            merged[k++] = a[i++];
        }

        // Copy remaining elements of array b, if any
        while (j < b.length) {
            merged[k++] = b[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};

        int[] result = mergeSortedArrays(arr1, arr2);

        System.out.print("Merged Sorted Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}