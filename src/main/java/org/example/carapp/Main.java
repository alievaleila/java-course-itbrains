package org.example.carapp;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("BMW", 95000, 10, "M5", 2020);
        c.showInfo();
        System.out.println(c.drive(50));
        c.refuel(85);
        System.out.println(c.drive(20));
        c.showInfo();

    }
}
