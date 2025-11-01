package org.example.hash;

import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        HashMap<String, String> phonebook = new HashMap<>();
        phonebook.put("Ibrahim", "+994708007550");
        phonebook.put("Reyhan", "+994708615115");
        phonebook.put("Elxan", "+994553956555");

        Scanner sc = new Scanner(System.in);
        while (true) {
            printMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(phonebook.get("Elxan"));
                    break;
                case 2:
                    phonebook.put("Leyla", "+994708007530");
                    System.out.println("Phone number was added: " + phonebook);
                    break;
                case 3:
                    phonebook.remove("Ibrahim");
                    System.out.println("Phone number was deleted" + phonebook);
                    break;
                case 4:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("-----Phonebook-----");
        System.out.println(" 1. Find a number.");
        System.out.println(" 2. Add a number.");
        System.out.println(" 3. Delete a number");
        System.out.println(" 4. Exit.");
        System.out.println("Enter your choice: ");
    }
}
