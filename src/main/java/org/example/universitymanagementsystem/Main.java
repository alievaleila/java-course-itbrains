package org.example.universitymanagementsystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(21, Department.IT, "Leyla");
        Student s1 = new Student(25, Department.BIZNESS, "Ismet");

        Course c = new Course(16, "Leyla");
        c.showCourseInfo();


    }
}
