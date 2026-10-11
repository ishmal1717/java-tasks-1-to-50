//OOP
class Rectangle {
    double width;
    double height;

    // Constructor to initialize width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate and return the area
    public double area() {
        return width * height;
    }

    // Method to calculate and return the perimeter
    public double perimeter() {
        return 2 * (width + height);
    }

    // Method to check if the rectangle is a square
    public boolean isSquare() {
        return width == height;
    }
}

// Main execution class
public class task4 {
    public static void main(String[] args) {
        // Create two Rectangle objects
        Rectangle rect1 = new Rectangle(5.0, 10.0);
        Rectangle rect2 = new Rectangle(7.0, 7.0);

        // Display properties for Rectangle 1
        System.out.println("Rectangle 1:");
        System.out.println("  Dimensions: " + rect1.width + " x " + rect1.height);
        System.out.println("  Area: " + rect1.area());
        System.out.println("  Perimeter: " + rect1.perimeter());
        System.out.println("  Is Square? " + rect1.isSquare());

        System.out.println();

        // Display properties for Rectangle 2
        System.out.println("Rectangle 2:");
        System.out.println("  Dimensions: " + rect2.width + " x " + rect2.height);
        System.out.println("  Area: " + rect2.area());
        System.out.println("  Perimeter: " + rect2.perimeter());
        System.out.println("  Is Square? " + rect2.isSquare());

        System.out.println();

        // Compare areas and print the one with the larger area
        if (rect1.area() > rect2.area()) {
            System.out.println("Result: Rectangle 1 has the larger area (" + rect1.area() + ").");
        } else if (rect2.area() > rect1.area()) {
            System.out.println("Result: Rectangle 2 has the larger area (" + rect2.area() + ").");
        } else {
            System.out.println("Result: Both rectangles have equal areas.");
        }
    }
}