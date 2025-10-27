package org.example.enums.employeeranksystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees =new ArrayList<>();

        Employee e=new Employee("Leyla",800,Rank.JUNIOR);
        Employee e1=new Employee("Rovshan",1000,Rank.MID);
        Employee e2=new Employee("Ibrahim",1200,Rank.SENIOR);
        Employee e3=new Employee("Elxan",1300,Rank.LEAD);

        employees.add(e);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        for(Employee employee:employees){
            employee.showInfo();
        }
    }
}
