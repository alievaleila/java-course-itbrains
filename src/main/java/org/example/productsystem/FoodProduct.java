package org.example.productsystem;

public class FoodProduct extends Product {

    private int expiryDay;

    public FoodProduct(String name, double basePrice,int expiryDay) {
        super(name, basePrice);
        this.expiryDay=expiryDay;
    }

    @Override
    public double calculatePrice() {
        if(expiryDay<5){
            return getBasePrice()*0.9;
        }else{
            return getBasePrice();
        }
    }
}
