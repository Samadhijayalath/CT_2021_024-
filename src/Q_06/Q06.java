package Q_06;
import javax.swing.JFrame;
import java.util.Scanner;
public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width of the frame (in pixels): ");
        int width = input.nextInt();

        System.out.print("Enter the height of the frame (in pixels): ");
        int height = input.nextInt();
        System.out.print("Enter the title of the frame: ");
        String title = input.next();

        input.close();


        JFrame welcomeFrame;
        welcomeFrame = new JFrame();
        welcomeFrame.setSize(width, height);
        welcomeFrame.setTitle(title);
        welcomeFrame.setVisible(true);

    }

}
