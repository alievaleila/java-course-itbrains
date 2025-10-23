package org.example.enums.seasons;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the season: ");
        String input = sc.next().toUpperCase();
        try {
            Season season = Season.valueOf(input);
            switch (season) {
                case WINTER -> System.out.println("Cold");
                case SPRING -> System.out.println("Warm");
                case SUMMER -> System.out.println("Hot");
                case AUTUMN -> System.out.println("Cool");
            }
        }catch(IllegalArgumentException e){
            System.out.println("Invalid input");
        }
    }
}
