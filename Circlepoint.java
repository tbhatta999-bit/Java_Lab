class Point {
    int x, y;

    // Constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to display point
    void displayPoint() {
        System.out.println("Center Point: (" + x + ", " + y + ")");
    }
}

class Circle {
    Point center;   // Object of Point class
    double radius;

    // Constructor
    Circle(int x, int y, double radius) {
        center = new Point(x, y);  // Composition
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display details
    void displayCircle() {
        center.displayPoint();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(3, 4, 5.0);
        c.displayCircle();
    }
}
