package org.example.calculateapp;

public class Calculator {

    public double calculate(double a, double b, String operation){
        return switch(operation){
            case "+" -> a+b;
            case "-" -> a+b;
            case "*" -> a*b;
            case "/" -> (b==0)?Double.NaN :(a/b) ;
            default -> 0;
        };
    }

}
