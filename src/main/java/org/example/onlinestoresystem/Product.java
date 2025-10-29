package org.example.onlinestoresystem;

public class Product {

    private String name;
    private double basePrice;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }

    double calculatePrice() {
        return basePrice;
    }

    void showInfo() {
        System.out.println("Name: " + name + ", basePrice: " + calculatePrice());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
