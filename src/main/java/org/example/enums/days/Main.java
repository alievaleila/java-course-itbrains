package org.example.enums.days;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day: ");

        String input = sc.next().toUpperCase();
        try {
            Days day = Days.valueOf(input);

            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Workday");
                case SATURDAY, SUNDAY -> System.out.println("Weekend");

            }
        } catch (IllegalArgumentException e) {
            System.out.println("Pls enter a valid day");
        }
    }
}
