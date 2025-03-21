package Q_06;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentYear = 2025;

        System.out.print("Enter the year you were born: ");
        int birthYear = scanner.nextInt();

        int age = currentYear - birthYear;

        System.out.println("\nYou were born in " + birthYear + " and will be (are) " + age + " this year.");

        scanner.close();
    }
}
