package Q_01;
import java.util.Scanner;
public class A{
        public static void main(String[] args){
            Scanner input =new Scanner(System.in);

            System.out.println("Enter value for A=");
            double A=input.nextDouble();

            System.out.println("Enter value for B=");
            double B=input.nextDouble();
            System.out.println("Enter value for C=");
            double C=input.nextDouble();

            double result=Math.sqrt(B*B+ 4*A*C);
            System.out.println(result);
           input.close();

        }
}
