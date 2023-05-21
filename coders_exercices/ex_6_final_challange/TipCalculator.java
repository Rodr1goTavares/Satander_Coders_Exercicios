package coders_exercices.ex_6_final_challange;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 *
 * Resolução do exercício 6 (final)
 * 
 */

 public class TipCalculator {

    public static void start() {
        FruitList fruitList = new FruitList();
        Map<String, Double> fruitsToBuy = fruitList.getFruitList();

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(fruitList.toString());
            System.out.println("Enter which fruits you bought:");

            List<String> purchasedFruits = Arrays.asList(scanner.nextLine().split(" "));
            CalcResult calcResult = new CalcResult(fruitsToBuy, purchasedFruits);

            System.out.println(calcResult.getFullResult());
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            scanner.close();
        }
    }
}
