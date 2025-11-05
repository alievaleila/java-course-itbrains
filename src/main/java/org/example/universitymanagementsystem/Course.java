package org.example.universitymanagementsystem;

import java.util.ArrayList;

public class Course {
    private String name;
    private int credits;

    public Course(int credits, String name) {
        this.credits = credits;
        this.name = name;
        this.students = students;
        this.teachers = teachers;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ArrayList<Student> students=new ArrayList<>();
    ArrayList<Teacher> teachers=new ArrayList<>();




    public void showCourseInfo(){
        System.out.println(students+","+teachers);
    }

}
