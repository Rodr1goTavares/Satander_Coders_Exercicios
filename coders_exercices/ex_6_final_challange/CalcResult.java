package coders_exercices.ex_6_final_challange;


import java.util.List;
import java.util.Map;

public class CalcResult {
    private Map<String, Double> productList;
    private List<String> purchasedProductsList;

    private double percentage;
    
    public CalcResult(Map<String, Double> productList, List<String> purchasedProductsList) {
        this.productList = productList;
        this.purchasedProductsList = purchasedProductsList;

        this.percentage = Math.round(((((double)purchasedProductsList.size() / (double)productList.size()) * 100.0) * 10.0) / 10.0);
    }

    public double getPercentage() {
        return this.percentage;
    }

    public double getTip() {
        double tip = 0;
        
        if (this.percentage >= 90.0) {
            tip = 10.0;
        }
        else if (this.percentage >= 75.0) {
            tip = 5.0;
        }
        else if (this.percentage >= 50.0) {
            tip = 3.0;
        }
        return tip;
    }

    public double getFruitsValue() {
        double fruitsValue = 0;
        for (String product : purchasedProductsList) {
            fruitsValue += productList.get(product);
        }
        return fruitsValue + getTip();
    }

    public String getFullResult() {
        StringBuilder result = new StringBuilder();
        result.append("-----<< Result >>-----");
        result.append("\nFruits purchased: ").append(getPercentage() + "%   (Min to tip: 50%)");
        result.append("\nFruits value: ").append(getFruitsValue() + "$");
        result.append("\nTip: ").append(getTip() + "$");
        result.append("\nTotal cost: ").append(getFruitsValue() + getTip() + "$");
        return result.toString();
    }
}
