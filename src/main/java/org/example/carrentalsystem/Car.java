package org.example.carrentalsystem;

public class Car {

    private String model;
    private double pricePerDay;

    public Car(String model, double pricePerDay) {
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    void displayInfo() {
        System.out.println(getModel() + " - " + getPricePerDay() + " azn/day ");
    }


}
