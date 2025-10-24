package org.example.productsystem;

public class Product {
    private String name;
    private double basePrice;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double calculatePrice(){
        return basePrice;
    }

    public void showInfo(){
        System.out.println("Product name: "+ getName()+ "Price: "+ calculatePrice());
    }


}
