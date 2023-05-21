package coders_exercices.ex_6_final_challange;

import java.util.HashMap;
import java.util.Map;


public class FruitList {
    private Map<String, Double> fruitsList = new HashMap<>();

    public FruitList() {
        this.setFruits();
    }

    private void setFruits() {
        fruitsList.put("banana", 10.0);
        fruitsList.put("abacate", 20.0);
        fruitsList.put("morango", 10.0);
        fruitsList.put("manga", 12.0);
        fruitsList.put("uva", 11.0);
        fruitsList.put("abacaxi", 15.0);
        fruitsList.put("goiaba", 18.0);
    }

    public Map<String, Double> getFruitList() {
        return this.fruitsList;
    }

    public String toString() {
        StringBuilder fruitListInString = new StringBuilder();
        fruitListInString.append("------< Fruit List >>------");
        for (String fruit : this.fruitsList.keySet()) {
            fruitListInString.append("\n" + fruit + ": ").append(this.fruitsList.get(fruit) + "$");
        }
        fruitListInString.append("\n------------------------");
        return fruitListInString.toString();
    }
}
