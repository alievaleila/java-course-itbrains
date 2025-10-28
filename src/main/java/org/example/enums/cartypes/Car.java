package org.example.enums.cartypes;

public class Car {
    private String brand;
    private String model;
    private double pricePerDay;
    private CarType type;

    public CarType getType() {
        return type;
    }

    public Car(String brand, String model, double pricePerDay, CarType type) {
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.type = type;
    }

    void showInfo(){
        System.out.println("Brand: "+brand+", model: "+ model + ", price per day: "+ pricePerDay +", type:"+ type);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", type=" + type +
                '}';
    }
}
