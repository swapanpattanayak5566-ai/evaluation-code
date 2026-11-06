
class Shape {

    Shape() {
        System.out.println("Shape Constructor");
    }

    void calculateArea() {
        System.out.println("Calculating area of Shape");
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {

    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {

    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

public class Main {

    public static void main(String[] args) {

        Shape s;

        s = new Circle(5);
        s.calculateArea();

        s = new Rectangle(10, 5);
        s.calculateArea();

        s = new Triangle(8, 6);
        s.calculateArea();
    }
}
