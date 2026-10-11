// Define InterfaceA with a default method
interface InterfaceA {
    default void hello() {
        System.out.println("Hello from Interface A");
    }
}

// Define InterfaceB with a default method
interface InterfaceB {
    default void hello() {
        System.out.println("Hello from Interface B");
    }
}

// Class TaskC implements both and resolves the conflict
class TaskC implements InterfaceA, InterfaceB {
    @Override
    public void hello() {
        // Call InterfaceA's default method
        InterfaceA.super.hello();

        // Call InterfaceB's default method
        InterfaceB.super.hello();

        System.out.println("Hello from Implementing Class TaskC");
    }
}

// Main execution class matching the filename task45.java
public class task45 {
    public static void main(String[] args) {
        TaskC obj = new TaskC();
        obj.hello();
    }
}