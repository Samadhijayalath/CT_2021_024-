package Q_01;

import java.util.Scanner;

public class D {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter value for r=");
        double radius = input.nextDouble();

        double area =Math.PI*Math.pow(radius,2);
        System.out.println("are of circle is a "+area);
        input.close();
    }
}
