package org.example.enums.studentgradesystem;

public class Student {

    private String name;
    private int score;
    private Grade grade;

    public Student(String name, int score, Grade grade) {
        this.name = name;
        this.score = score;
        this.grade = Grade.getGrade(score);
    }

    public int getScore() {
        return score;
    }

    void showInfo() {
        System.out.println("Name: " + name + ", grade: " + Grade.getGrade(score));
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", grade=" + grade +
                '}';
    }
}
