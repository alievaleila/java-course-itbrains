package org.example.enums.employeeranksystem;

public class Employee {
    private String name;
    private double baseSalary;
    private Rank rank;

    public Employee(String name, double baseSalary, Rank rank) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.rank = rank;
    }

    double calculateSalary(){
        return baseSalary*rank.getMultiplier();
    }

    void showInfo(){
        System.out.println("Name: "+ name+ ", rank: " +rank+", salary: "+ calculateSalary());
    }
}
