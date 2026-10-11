public class task19 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 2, 4, 1, 3};
        int n = arr.length;

        int[] uniqueArr = new int[n];
        int uniqueCount = 0;

        // Filter unique elements preserving order
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == uniqueArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArr[uniqueCount++] = arr[i];
            }
        }

        // Print result
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArr[i] + " ");
        }
        System.out.println();
    }
}