package Q_09;
import java.util.Scanner;
public class Q9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (R) in percentage: ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter the number of years (N): ");
        int years = scanner.nextInt();

        double amount = principal * Math.pow(1 + (interestRate / 100), years);

        double moneyEarned = amount - principal;

        System.out.println("\nTotal amount after " + years + " years: " +
                String.format("%.2f", amount));
        System.out.println("Money earned after " + years + " years: " +
                String.format("%.2f", moneyEarned));

        scanner.close();
    }
}
