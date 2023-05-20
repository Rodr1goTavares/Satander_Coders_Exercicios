package coders_exercices.ex6_final_challange;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 *
 * Resolução do exercício 6 (final)
 * 
 */

 public class TipCalculator {

    private static Buyer buyer = new Buyer();

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Say a products to send to buyer (type names separated with space):");

            List<String> fruitsToBuy = Arrays.asList(scanner.nextLine().split(" "));
            buyer.sendFruitList(fruitsToBuy);
            List<String> purchasedFruits = buyer.getPurchasedFruits();

            System.out.println("Buyer result: " + purchasedFruits);

            BuyListCalc buyListCalc = new BuyListCalc(fruitsToBuy, purchasedFruits);
            System.out.println(buyListCalc.getPercentage());

            start();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            scanner.close();
        }
    }
}
