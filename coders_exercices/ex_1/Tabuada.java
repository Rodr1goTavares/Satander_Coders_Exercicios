package coders_exercices.ex_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Say a number:");
            int number = scanner.nextInt();
            scanner.close();

            calc(number);
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid argument. (Only 0-10 numbers)" + "\n" + e);
        }
        finally {
            start();
        } 
    }

    private static void calc(int number) {
        for (int i = 1; i < 11; i++) {
            String table = number + " x " + i + " = " + (number * i); 
            System.out.println(table);
        }
    }
}
