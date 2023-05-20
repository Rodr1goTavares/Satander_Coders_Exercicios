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
            
            showfruitList(fruitList);
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
    
    private static void showfruitList(String[] fruitList) {
        StringBuilder fruitListString = new StringBuilder();
        fruitListString.append("Fruits in your cart:");
        
        for (int i = 0; i < fruitList.length; i++) {
            fruitListString.append("\n" + fruitList[i]);
        }

        System.out.println(fruitListString.toString());
    }   
}
