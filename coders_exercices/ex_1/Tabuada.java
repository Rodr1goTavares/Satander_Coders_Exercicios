package coders_exercices.ex_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *
 * Resolução do exercício 1
 * 
 */

public class Tabuada {

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            try {         
                System.out.println("<< Say a number: >>");
                long number = scanner.nextLong();
                System.out.println(calc(number));
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid argument. (Only 0-9223372036854775807 numbers)" + "\n" + e);
                repeat = false;
                start();
            }       
        }
        scanner.close();
    }

    private static String calc(long number) {
        StringBuilder table = new StringBuilder();
        table.append("--------<<" + number + ">>--------");

        for (int i = 1; i < 11; i++) {
            table.append("\n" + number + " x " + i + " = " + (number * i)); 
        }

        table.append("\n--------------------");
        return table.toString();
    }
}
