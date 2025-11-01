package org.example.hash;

import java.util.HashSet;
import java.util.Scanner;

public class UnrepeatedWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String a = sc.nextLine();

        HashSet<Character> letters = new HashSet<>();
        StringBuilder unique = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (letters.add(a.charAt(i))) {
                unique.append(a.charAt(i));
            }
        }
        System.out.println(unique);
    }
}

