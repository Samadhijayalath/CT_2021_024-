package Q_02;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter centimeter you want to convert=");
        double Centimeters=scanner.nextDouble();


        double inches=(Centimeters/2.54);
        int feet=(int)(inches/12);
        double inch = (inches % 12);
        System.out.println(feet +"feet and "+inch +" inches");
        scanner.close();
    }

}
