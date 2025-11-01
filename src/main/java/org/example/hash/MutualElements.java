package org.example.hash;

import java.util.Arrays;
import java.util.HashSet;

public class MutualElements {
    public static void main(String[] args) {
        HashSet<Integer> num1 = new HashSet<>(Arrays.asList(1, 2, 3, 43, 56, 67, 8));
        HashSet<Integer> num2 = new HashSet<>(Arrays.asList(8, 67, 1, 3, 4, 5, 76));
        num1.retainAll(num2);
        System.out.println(num1);
    }
}
