package org.example.enums.subjects;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Leyla");
        Teacher t1 = new Teacher("Ibrahim");
        t.addSubject(Subject.MATH);
        t1.addSubject(Subject.PHYSICS);
        t.showInfo();
        t1.showInfo();
    }
}
