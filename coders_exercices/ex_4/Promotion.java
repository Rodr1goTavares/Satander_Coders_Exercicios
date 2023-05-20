package coders_exercices.ex_4;

import java.util.Arrays;
import java.util.Scanner;

/*
 *
 * Resolução do exercício 4
 * 
 */

public class Promotion {

    private static final String[] promotions = new String[]{"banana", "abacate", "abacaxi", "uva", "laranja"};
    
    public static void start() {

        System.out.println("Items in promotion: " + Arrays.toString(promotions));
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Say a product to buy:");
            String product = scanner.nextLine();
            
            System.out.println(verifyProduct(product));
        }
        catch (Exception e) {
            System.out.println("Error to verify product: " + e);
        }
        finally {
            start();
            scanner.close();
        }
        
    }

    private static String verifyProduct(String product) {
        String result = "<< Good choice ! >>";
        for (String promotionalItem : promotions) {
            if (promotionalItem.equals(product)) {
                result = "<<** Nice choice, this product is on promotion ! **>>";
            }
        }
        return result;
    }
}
