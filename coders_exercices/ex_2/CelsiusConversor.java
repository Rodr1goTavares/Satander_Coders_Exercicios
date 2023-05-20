package coders_exercices.ex_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *
 * Resolução do exercício 2
 * 
 */

public class CelsiusConversor {
    
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Say a celsius temperature:");
            double celsiusTemperature = scanner.nextDouble();

            System.out.println(toFahrenheit(celsiusTemperature));
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid argument. (Say a celsius temperature (Ex: 0.5, 23.2, 25...))" + "\n" + e);
        }
        finally {
            scanner.close();
            start();
        }
    }
    
    private static String toFahrenheit(double celsiusTempertature) {
        double fahrenheit = (celsiusTempertature * (9.0 / 5.0)) + 32;
        return celsiusTempertature + "° Celsius is " + fahrenheit + "° Fahrenheit.";
    }
}
