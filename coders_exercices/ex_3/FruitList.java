package coders_exercices.ex_3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *
 * Resolução do exercício 3
 * 
 */

public class FruitList {
    
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        try {
            String[] fruitList = new String[5];
            System.out.println("<< Insert your buy list >>");
            for (int i = 0; i < 5; i++) {
                System.out.println("Fruit:");
                fruitList[i] = scanner.nextLine();

                if (fruitList[i].equals(" ")) {
                    throw new InputMismatchException("Invalid argment");
                }
            }
            
            System.out.println(showfruitList(fruitList));
            start();
        }
        catch (Exception e) {
            System.out.println("Error" + e);
            start();
        }
        finally {
            scanner.close();
        }
    }
    
    private static String showfruitList(String[] fruitList) {
        StringBuilder fruitListString = new StringBuilder();
        fruitListString.append("\nFruits in your cart:");
        fruitListString.append("\n--------------------");
        
        for (int i = 0; i < fruitList.length; i++) {
            fruitListString.append("\n" + fruitList[i]);
        }

        fruitListString.append("\n--------------------");
        return fruitListString.toString();
    }   
}
