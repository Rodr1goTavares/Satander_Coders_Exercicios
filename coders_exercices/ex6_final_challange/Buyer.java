package coders_exercices.ex6_final_challange;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Buyer {
    
    private List<String> fruitList;

    public void sendFruitList(List<String> fruitList) {
        this.fruitList = fruitList;
    }

    public List<String> getPurchasedFruits() {
        List<String> purchasedFruits = new ArrayList<>();

        int randomAmount = new Random().nextInt(this.fruitList.size());
        for (int i = 0; i < randomAmount; i++) {
            purchasedFruits.add(this.fruitList.get(i));
        }

        return purchasedFruits;
    }
}
