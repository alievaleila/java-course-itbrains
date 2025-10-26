package org.example.carrentalsystem;

import java.util.Scanner;

public class CarRentalSystem {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        Car[] cars = {new EconomyCar("Toyota Corella", 50),
                new SportCar("BMW M4", 150),
                new SUV("Range Rover", 200)};


        while (true) {
            System.out.println("\n--- Car Rental System ---");
            System.out.println("1.Show car list: ");
            System.out.println("2.Rent a car: ");
            System.out.println("3.Exit");
            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("The program terminated");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("\nCurrent cars:");
                    for (int i = 0; i < cars.length; i++) {
                        System.out.print((i + 1 + "."));
                        cars[i].displayInfo();
                    }
                    break;
                case 2:
                    System.out.println("Which one do you want to rent?(1-3)");
                    int index = sc.nextInt() - 1;
                    if (index >= 0 && index < cars.length) {
                        System.out.println("You rented " + cars[index].getModel());
                    } else {
                        System.out.println("Invalid choice");
                    }
                    break;
                case 3:
                    System.out.println("Exit the system..");
                    return;
                default:
                    System.out.println("Invalid choice");


            }
        }
    }
}
