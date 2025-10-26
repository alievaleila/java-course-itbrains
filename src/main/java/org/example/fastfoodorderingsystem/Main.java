package org.example.fastfoodorderingsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        Order o = new Order();

        while (true) {

            System.out.println("-----Menu Item-----");
            System.out.println("1.Hamburger - 5 AZN");
            System.out.println("2.Pizza - 8 AZN");
            System.out.println("3.Cola - 2 AZN");
            System.out.println("4.Show the bill");
            System.out.println("5.Exit");

            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exit the program..");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println(o.addItem(new MenuItem("Hamburger", 5)));
                    break;
                case 2:
                    System.out.println(o.addItem(new MenuItem("Pizza", 8)));
                    break;
                case 3:
                    System.out.println(o.addItem(new MenuItem("Cola", 2)));
                    break;
                case 4:
                    o.showItem();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
