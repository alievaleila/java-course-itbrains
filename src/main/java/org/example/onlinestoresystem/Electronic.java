package org.example.onlinestoresystem;

public class Electronic extends Product{
    private int warrantyYears;

    public Electronic(String name, double basePrice, int warrantyYears) {
        super(name, basePrice);
        this.warrantyYears = warrantyYears;
    }

    @Override
    double calculatePrice() {
        return getBasePrice() + warrantyYears * 70;
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "name=" + super.getName() +
                ", price=" + super.getBasePrice() +
                ", warrantyYears=" + warrantyYears +
                '}';
    }
}
