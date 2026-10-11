class Counter {
    static int totalObjects = 0; // Shared across all instances (static)
    int instanceCount = 0;      // Unique to each object (instance)

    // Constructor increments the total object count
    public Counter() {
        totalObjects++;
    }

    // Method to increment the instance counter
    public void increment() {
        instanceCount++;
    }
}

public class task8 {
    public static void main(String[] args) {
        // Create 3 objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Increment them different numbers of times
        c1.increment();
        c1.increment();
        c1.increment(); // c1 incremented 3 times

        c2.increment();
        c2.increment(); // c2 incremented 2 times

        c3.increment(); // c3 incremented 1 time

        // Print counts
        System.out.println("Total objects created: " + Counter.totalObjects);
        System.out.println("Counter 1 increments: " + c1.instanceCount);
        System.out.println("Counter 2 increments: " + c2.instanceCount);
        System.out.println("Counter 3 increments: " + c3.instanceCount);
    }
}