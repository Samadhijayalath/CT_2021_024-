package Q03;
import java.util.Scanner;

class Circle1 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double computeArea() {
        return Math.PI * radius * radius;
    }
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter inner radius: ");
        double innerRadius = scanner.nextDouble();

        System.out.print("Enter outer radius: ");
        double outerRadius = scanner.nextDouble();

        Circle1 innerCircle = new Circle1(innerRadius);
        Circle1 outerCircle = new Circle1(outerRadius);

        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();
        System.out.println("Shaded Area: " + shadedArea);

        scanner.close();
    }
}

