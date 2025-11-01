package org.example.hash;

import java.util.HashMap;
import java.util.Map;

public class StudentGradeSystem {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Leyla", 98);
        students.put("Ibrahim", 91);
        students.put("Rovshan", 100);
        students.put("Vugar", 75);
        System.out.println(students);

        int max = 0;
        String topstudent = "";
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                topstudent = entry.getKey();
            }
        }
        System.out.println(topstudent + " " + max);
    }
}
