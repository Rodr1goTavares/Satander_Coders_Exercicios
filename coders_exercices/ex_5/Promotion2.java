package coders_exercices.ex_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 *
 * Resolução do exercício 5
 * 
 */

public class Promotion2 {

    private static final String[] promotions = new String[]{"banana", "abacate", "abacaxi", "uva", "laranja"};
    
    public static void start() {

        System.out.println("Items in promotion: " + Arrays.toString(promotions));
        
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Say a products to buy (type names separated with space):");
            String[] productList = scanner.nextLine().split(" ");
            System.out.println(verifyProductList(productList));
        }
        catch (Exception e) {
            System.out.println("Error to verify product: " + e);
        }
        finally {
            start();
            scanner.close();
        }
    }

    private static String verifyProductList(String[] productList) {
        StringBuilder result = new StringBuilder();
        result.append("----------------------------------------");
        result.append("\nSelected items: " + Arrays.toString(productList));
        
        int discount = 0;
        List<String> promotionalItemSelected = new ArrayList<>();

        for (String promotionalItem : promotions) {
            for (String product : productList) {
                if (product.equals(promotionalItem)) {
                    discount += 5;
                    promotionalItemSelected.add(promotionalItem);
                }
            }
        }
        result.append("\nPromotional items selected: " + promotionalItemSelected.toString());
        result.append("\n<<Final discount: ").append(discount + "% >>");
        result.append("\n----------------------------------------");

        return result.toString();
    }
}
