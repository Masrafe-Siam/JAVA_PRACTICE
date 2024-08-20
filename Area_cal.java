import java.util.Scanner;

public class Area {
    double length;
    double breadth;

    void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }
}

public class Area_cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = scanner.nextDouble();

        Area rectangle = new Area();
        rectangle.setDim(length, breadth);

        System.out.println("Area of the rectangle: " + rectangle.getArea());

        scanner.close();
    }
}
