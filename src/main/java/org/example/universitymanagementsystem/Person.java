package org.example.universitymanagementsystem;

public abstract class Person {
    private String name;
    private int age;
    private Department department;

    public Person(int age, Department department, String name) {
        this.age = age;
        this.department = department;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}
