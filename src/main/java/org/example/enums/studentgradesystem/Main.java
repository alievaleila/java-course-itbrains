package org.example.enums.studentgradesystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int f = sc.nextInt();

        students.add(new Student("Leyla", a, Grade.getGrade(a)));
        students.add(new Student("Ibrahim", b, Grade.getGrade(b)));
        students.add(new Student("Rovshan", c, Grade.getGrade(c)));
        students.add(new Student("Elxan", d, Grade.getGrade(d)));
        students.add(new Student("Aysel", f, Grade.getGrade(f)));

        System.out.println(students);

        ArrayList<Student> highScores = new ArrayList<>();

        for (Student s : students) {
            if (s.getScore() >= 80 && s.getScore() <= 100) {
                highScores.add(s);
            }
        }
        System.out.println(highScores);
    }
}
