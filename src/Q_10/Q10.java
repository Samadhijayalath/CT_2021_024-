package Q_10;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an odd-length word");
        String input = scanner.nextLine();


        if (input.length() % 2 == 0) {
            System.out.println("Please enter a word with an odd number of characters.");
        } else {

            int mIndex = input.length() / 2;
            char mChar = input.charAt(mIndex);


            System.out.println("Middle character: " + mChar);
        }


        scanner.close();
    }
}
