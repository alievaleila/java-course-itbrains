package org.example.hash;

import java.util.HashSet;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 32, 3, 3, 2, 4, 5, 7, 8};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> dublicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                dublicates.add(num);
            }
        }
        seen.removeAll(dublicates);
        System.out.println(seen);
    }
}