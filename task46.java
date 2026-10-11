public class task46 {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        int maxSoFar = arr[0];
        int currMax = arr[0];
        int start = 0, end = 0, s = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currMax + arr[i]) {
                currMax = arr[i];
                s = i;
            } else {
                currMax += arr[i];
            }

            if (currMax > maxSoFar) {
                maxSoFar = currMax;
                start = s;
                end = i;
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSoFar);
        System.out.println("Start Index: " + start + ", End Index: " + end);
    }
}