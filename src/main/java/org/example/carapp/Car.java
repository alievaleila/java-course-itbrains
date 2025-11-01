package org.example.carapp;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double fuelLevel;
    private double distance;

    public Car(String brand, double distance, double fuelLevel, String model, int year) {
        this.brand = brand;
        this.distance = distance;
        this.fuelLevel = fuelLevel;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double drive(double km) {
        if (km < 0) {
            throw new IllegalOperationException("km can't be negative.");
        }

        if (fuelLevel <= 0) {
            throw new InsufficientFuelException("Fuel is insufficient");
        }

        double litre = 0.1 * km;
        return fuelLevel - litre;
    }

    public void refuel(double litres) {
        final double fuelCapacity = 50;

        if (fuelLevel + litres >= fuelCapacity) {
            System.out.println(fuelCapacity);
            System.out.println("No need for recharging.Excess fuel was not added.");
        } else if (fuelLevel + litres < fuelCapacity) {
            System.out.println(fuelLevel + litres);
        }

        System.out.println("Fuel level is " + fuelLevel + " litres");
    }

    public void showInfo() {
        System.out.println(getBrand() + " " + getModel() + " " + getYear() + " " + getDistance() + " " + getFuelLevel());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", fuelLevel=" + fuelLevel +
                ", distance=" + distance +
                '}';
    }
}
