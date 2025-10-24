package org.example.productsystem;

public class ElectronicFood extends Product{
    private int warrantyYears;


    public ElectronicFood(String name, double basePrice,int warrantyYears) {
        super(name, basePrice);
        this.warrantyYears=warrantyYears;
    }

    @Override
    public double calculatePrice() {
        return getBasePrice()+ warrantyYears * 50;
    }
}
