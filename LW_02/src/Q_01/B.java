package Q_01;

import java.util.Scanner;
public class B {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("Enter value for X=");
        double X= input.nextDouble();
        System.out.println("Enter value for Y =");
        double Y= input.nextDouble();
        double result=Math.sqrt(X + 4*Y*3);
        System.out.println(result);
        input.close();
    }
}

