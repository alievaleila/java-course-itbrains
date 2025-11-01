package org.example.hash;

import java.util.HashMap;
import java.util.Map;

public class GradeAverage {
    public static void main(String[] args) {
        HashMap<String, Integer> subjects = new HashMap<>();

        subjects.put("Math", 90);
        subjects.put("English", 80);
        subjects.put("History", 70);

        int sum = 0;
        for (Map.Entry<String, Integer> entry : subjects.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println(sum);
    }
}

