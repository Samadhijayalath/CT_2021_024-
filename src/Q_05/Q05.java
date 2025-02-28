package Q_05;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Q05 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        String date = formatter.format(today);
        System.out.println("Today's date: " + date);
    }

}
