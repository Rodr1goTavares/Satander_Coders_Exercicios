package coders_exercices.ex6_final_challange;

import java.util.List;

public class BuyListCalc {
    private List<String> productList;
    private List<String> purchasedProductsList;

    private int percentage;

    public BuyListCalc() {
        
    }
    
    public BuyListCalc(List<String> productList, List<String> purchasedProductsList) {
        this.productList = productList;
        this.purchasedProductsList = purchasedProductsList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }

    public void setPurchasedProdructsList(List<String> purchasedProductsList) {
        this.purchasedProductsList = purchasedProductsList; 
    }

    public double getPercentage() {
        return ((double)this.purchasedProductsList.size() / (double)this.productList.size()) * 100;
    }

    public String getTip() {
        return null;
    }
}
