package org.example.onlinestoresystem;

import java.util.Scanner;

public class OnlineStoreSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store s = new Store();

        while (true) {
            System.out.println("1.Add a product");
            System.out.println("2.Show all products");
            System.out.println("3.Exit");

            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter product name: ");
                    String productName1 = sc.nextLine();
                    System.out.println("Enter product price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter author: ");
                    String author1 = sc.nextLine();
                    System.out.println("Enter product discount percent: ");
                    int dis = sc.nextInt();
                    sc.nextLine();
                    s.addProduct(new Book(productName1, price, author1, dis));
                    System.out.println("Enter product name: ");
                    String productName2 = sc.nextLine();
                    System.out.println("Enter product price: ");
                    double price2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter size: ");
                    String size = sc.nextLine();
                    System.out.println("Enter season: ");
                    String season = sc.nextLine();
                    s.addProduct(new Clothing(productName2, price2, size, season));
                    System.out.println("Enter product name: ");
                    String productName3 = sc.nextLine();
                    System.out.println("Enter product price: ");
                    double price3 = sc.nextDouble();
                    System.out.println("Enter warranty year: ");
                    int wy = sc.nextInt();
                    sc.nextLine();
                    s.addProduct(new Electronic(productName3, price3, wy));
                    break;
                case 2:
                    s.showAllProducts();
                    break;
                case 3:
                    System.out.println("Exited");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
