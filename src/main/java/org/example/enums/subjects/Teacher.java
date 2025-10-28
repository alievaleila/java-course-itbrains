package org.example.enums.subjects;

import java.util.ArrayList;

public class Teacher {

    private String name;
    ArrayList<Subject> subjects;

    public Teacher(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    ArrayList<Subject> addSubject(Subject s) {
        subjects.add(s);
        return subjects;
    }

    void showInfo() {
        System.out.println("Name: " + name + ", subject: " + subjects);
    }
}
