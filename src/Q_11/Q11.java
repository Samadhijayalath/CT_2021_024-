package Q_11;
import java.util.Scanner;
public class Q11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your full name (first middle last): ");
        String fullName = scanner.nextLine().trim();


        String[] nameParts = fullName.split(" ");

        if (nameParts.length == 3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];


            String formattedName = lastName + ", " + firstName + " " + middleName.charAt(0) + ".";
            System.out.println("Formatted Name: " + formattedName);
        } else {
            System.out.println("Invalid input. Please enter a first, middle, and last name.");
        }

        scanner.close();
    }

}
