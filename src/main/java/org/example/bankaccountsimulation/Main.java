package org.example.bankaccountsimulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount("Leyla", 500);

        while (true) {
            System.out.println("-----Bank Account Simulation-----");
            System.out.println("1.Deposit money");
            System.out.println("2.Withdraw money");
            System.out.println("3.Show the balance");
            System.out.println("4.Exit");

            System.out.println("Enter your choice");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(b.deposit(50));
                    break;
                case 2:
                    System.out.println(b.withdraw(40));
                    break;
                case 3:
                    b.showBalance();
                    break;
                case 4:
                    System.out.println("Exit the program..");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
