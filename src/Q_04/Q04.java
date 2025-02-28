package Q_04;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Q04 {
     public static void main(String[] args) {
            Date today = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
            String date = formatter.format(today);
           System.out.println("Today's date: " + date);
        }
    }

