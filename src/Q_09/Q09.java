package Q_09;
import java.util.Scanner;

public class Q09 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        int length = input.length();


        char firstChar = input.charAt(0);
        char lastChar = input.charAt(length - 1);


        System.out.println("Number of characters: " + length);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);

        scanner.close();
    }
}
