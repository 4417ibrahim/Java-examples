abstract class Shape {
    // Abstract method for calculation
    abstract double calculation();
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the calculation method to calculate the area of the rectangle
    @Override
    double calculation() {
        return length * width;
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the calculation method to calculate the area of the circle
    @Override
    double calculation() {
        return Math.PI * radius * radius;
    }
}

// Main class to test the functionality
public class Abst {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + rectangle.calculation());

        // Create a Circle object
        Circle circle = new Circle(7);
        System.out.println("Area of Circle: " + circle.calculation());
    }
}