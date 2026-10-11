public class task40 {
    static int moveCount = 0;

    public static void solveHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromRod + " to " + toRod);
            moveCount++;
            return;
        }
        solveHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from " + fromRod + " to " + toRod);
        moveCount++;
        solveHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        solveHanoi(n, 'A', 'C', 'B');

        System.out.println("Total moves executed: " + moveCount);
        System.out.println("Expected formula (2^n - 1): " + ((1 << n) - 1));
    }
}