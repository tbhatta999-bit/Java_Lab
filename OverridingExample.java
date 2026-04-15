class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
