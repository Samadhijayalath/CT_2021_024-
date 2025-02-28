package Q_07;

import javax.swing.JFrame;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Q07 {
    public static void main (String[] args){

        Date now = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
        String currentTime = timeFormat.format(now);

        JFrame welcomeFrame;
        welcomeFrame = new JFrame(currentTime);
        welcomeFrame.setSize(800, 600);

        welcomeFrame.setVisible(true);


    }
}
