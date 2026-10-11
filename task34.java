class A {
    static {
        System.out.println("Static block A");
    }
    {
        System.out.println("Instance block A");
    }
    A() {
        System.out.println("Constructor A");
    }
}

class B extends A {
    static {
        System.out.println("Static block B");
    }
    {
        System.out.println("Instance block B");
    }
    B() {
        System.out.println("Constructor B");
    }
}

public class task34 {
    public static void main(String[] args) {
        System.out.println("--- First Object Creation ---");
        new B();
        System.out.println("\n--- Second Object Creation ---");
        new B();
    }
}