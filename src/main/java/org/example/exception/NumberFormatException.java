package org.example.exception;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the text: ");
            String a = sc.nextLine();

            int b = Integer.parseInt(a);
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
