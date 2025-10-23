package org.example.calculateapp;

import java.util.Scanner;

public class Menu {
    private final Calculator calculator = new Calculator();
    private final Scanner sc = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("Calculator menu: ");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("Exit");

            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("The program terminates. ");
                break;
            }

            String op = switch (choice) {
                case 1 -> "+";
                case 2 -> "-";
                case 3 -> "*";
                case 4 -> "/";
                default -> "";
            };

            System.out.println("Enter the first number: ");
            double a = sc.nextDouble();
            System.out.println("Enter the second number: ");
            double b = sc.nextDouble();

            double result = calculator.calculate(a, b, op);

            System.out.println("Result: " + result);


        }

    }
}
