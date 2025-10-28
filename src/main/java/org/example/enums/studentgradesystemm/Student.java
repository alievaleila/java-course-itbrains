package org.example.enums.studentgradesystemm;

public class Student {

    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade");
        }
    }

    String isPassed(){
        if(grade>=50){
            return "You passed the exam";
        }else{
            return "You failed";
        }
    }

    void getInfo(){
        System.out.println("Name: "+name+", grade: "+grade+ ", status: "+isPassed());
    }
}
