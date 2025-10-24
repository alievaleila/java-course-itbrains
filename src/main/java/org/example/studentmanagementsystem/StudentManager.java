package org.example.studentmanagementsystem;

import java.util.ArrayList;

public class StudentManager {
    public final ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> addStudent(Student student) {
        students.add(student);
        return students;
    }

    public Student showAllStudents() {
        for (int i = 0; i < students.size(); i++) {
            return students.get(i);

        }
        return null;
    }

    public Student findById(String id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public ArrayList<Student> deleteStudent(String name) {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                students.remove(s);
                return students;


            }

        }
        return null;
    }
}
