class Shape {
    public Shape next;

    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

public class MethodOverridingEx {
    // Method Parameter Polymorphism
    static void paint(Shape p) {
        p.draw();
    }

    public static void main(String[] args) {
        Line line = new Line();
        paint(line);

        Circle circle = new Circle();
        MethodOverridingEx.paint(circle);

    }
}
