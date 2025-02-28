package Q_08;
import java.util.Scanner;
public class Q08 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            System.out.print("Enter a string with a single exclamation mark (!): ");
            String userInput = input.nextLine();

            input.close();
            int exclamationIndex = userInput.indexOf("!");


            if (exclamationIndex != -1) {

                String part1 = userInput.substring(0, exclamationIndex).trim();
                String part2 = userInput.substring(exclamationIndex + 1).trim();

                System.out.println(part1);
                System.out.println(part2);
            } else {
                System.out.println("Error: No exclamation mark found in the input.");
            }
        }
    }


