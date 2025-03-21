package Q_07;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        int weight = scanner.nextInt();

        System.out.print("Enter your height in centimeters: ");
        int height = scanner.nextInt();

        double heightInMeters = height / 100.0;

        double bmi = weight / (heightInMeters * heightInMeters);

        System.out.println("\nYour Body Mass Index (BMI) is: " + String.format("%.2f", bmi));

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Your weight is normal.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
        scanner.close();
    }
}
