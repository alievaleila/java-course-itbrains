package org.example.enums.studentlevels;

public class Student {
    private Level level;
    private String name;

    public Student(String name, Level level) {
        this.name = name;
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println(getName() + " is at " + level + " level");
    }
}
