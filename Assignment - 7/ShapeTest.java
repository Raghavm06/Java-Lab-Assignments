class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void area() {
        double radius = 5;
        System.out.println("Area of Circle : " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    void area() {
        double length = 10;
        double width = 5;
        System.out.println("Area of Rectangle : " + (length * width));
    }
}

public class ShapeTest {
    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}