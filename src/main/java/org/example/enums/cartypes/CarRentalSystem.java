package org.example.enums.cartypes;

import java.util.ArrayList;

public class CarRentalSystem {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", "RAV4", 120.0, CarType.SUV));
        cars.add(new Car("BMW", "X5", 200.0, CarType.SUV));
        cars.add(new Car("Hyundai", "Tucson", 100.0, CarType.SUV));
        cars.add(new Car("Mercedes", "E200", 150.0, CarType.SEDAN));
        cars.add(new Car("Porsche", "911", 300.0, CarType.SPORT));
        cars.add(new Car("Volvo", "FH16", 250.0, CarType.TRUCK));

        System.out.println(cars);

        ArrayList<Car> suv=new ArrayList<>();
        for (Car c : cars) {
            if (c.getType() == CarType.SUV) {
                suv.add(c);
            }
        }
        System.out.println(suv);
    }
}
