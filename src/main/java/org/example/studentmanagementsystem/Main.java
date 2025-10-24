package org.example.studentmanagementsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();

        while (true) {
            System.out.println("Add a student: ");
            System.out.println("Show the list: ");
            System.out.println("Find by id: ");
            System.out.println("Delete: ");
            System.out.println("Exit");

            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("The program terminated");
                break;
            }

            switch (choice) {
                case 1 -> System.out.println(sm.addStudent(new Student("1", "Leyla", "Aliyeva", 21)));
                case 2 -> System.out.println(sm.showAllStudents());
                case 3 -> System.out.println(sm.findById("1"));
                case 4 -> System.out.println(sm.deleteStudent("Leyla"));
            }

        }
    }
}
