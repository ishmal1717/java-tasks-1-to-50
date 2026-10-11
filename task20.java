// Abstract class Shape
abstract class Shape {
    abstract double area();
}

// Circle subclass
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Triangle subclass
class Triangle extends Shape {
    double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

public class task20 {
    public static void main(String[] args) {
        // Store mixed objects in a Shape array
        Shape[] shapes = {
                new Circle(5.0),
                new Triangle(4.0, 6.0),
                new Circle(3.0)
        };

        double totalArea = 0;
        for (Shape s : shapes) {
            totalArea += s.area();
        }

        System.out.println("Total Area using polymorphism: " + totalArea);
    }
}