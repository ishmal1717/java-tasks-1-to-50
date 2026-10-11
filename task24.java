class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }
}

public class task24 {
    public static void main(String[] args) {
        // Define three points forming a right-angled triangle (e.g., sides 3, 4, 5)
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(0, 4);

        // Calculate side lengths squared
        double ab = p1.distanceTo(p2);
        double bc = p2.distanceTo(p3);
        double ca = p3.distanceTo(p1);

        double ab2 = ab * ab;
        double bc2 = bc * bc;
        double ca2 = ca * ca;

        // Check Pythagorean theorem (a^2 + b^2 = c^2) with a small tolerance for floating-point precision
        double eps = 1e-9;
        boolean isRightAngled = (Math.abs((ab2 + bc2) - ca2) < eps) ||
                (Math.abs((bc2 + ca2) - ab2) < eps) ||
                (Math.abs((ca2 + ab2) - bc2) < eps);

        System.out.println("Side lengths: AB = " + ab + ", BC = " + bc + ", CA = " + ca);
        System.out.println("Do these points form a right-angled triangle? " + isRightAngled);
    }
}