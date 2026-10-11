class Calculator {
    void add(int a, int b) {
        System.out.println("Called add(int, int): " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Called add(double, double): " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Called add(int, int, int): " + (a + b + c));
    }

    void add(String a, String b) {
        System.out.println("Called add(String, String): " + a + b);
    }
}

public class task27 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(5, 2.5);   // Matches double,double via widening (5 becomes 5.0)
        calc.add('a', 1);   // Chars widen to int ('a' is ASCII 97, so 97 + 1 = 98)
        calc.add("5", "2"); // Matches String,String
    }
}