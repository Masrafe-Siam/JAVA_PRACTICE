class Triangle {
    double side1 = 3;
    double side2 = 4;
    double side3 = 5;

    double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    double getPerimeter() {
        return side1 + side2 + side3;
    }
}

public class TriangleMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
