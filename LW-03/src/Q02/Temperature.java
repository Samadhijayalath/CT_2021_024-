package Q02;
import java.util.Scanner;

class Tempe {
    private double celsius;

    public Tempe() {
        this.celsius = 0.0;
    }

    public Tempe(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public double toCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheitInput = scanner.nextDouble();

        Tempe temp = new Tempe();
        temp.setFahrenheit(fahrenheitInput);
        System.out.println("Equivalent Celsius: " + temp.toCelsius());

        scanner.close();
    }
}


