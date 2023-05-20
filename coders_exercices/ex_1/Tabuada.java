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
        try {
            System.out.println("<< Say a number: >>");
            int number = scanner.nextInt();
            
            System.out.println(calc(number));
            start();
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid argument. (Only 0-10 numbers)" + "\n" + e);
        }
        finally {
            scanner.close();
        } 
    }

    private static String calc(int number) {
        StringBuilder table = new StringBuilder();
        table.append("--------<<" + number + ">>--------");

        for (int i = 1; i < 11; i++) {
            table.append("\n" + number + " x " + i + " = " + (number * i)); 
        }

        table.append("\n--------------------");
        return table.toString();
    }
}
