package org.example.enumandprice;

public class Main {
    public static void main(String[] args) {
        Currency c= Currency.valueOf("azn");
        System.out.println(c.convertToAzn(3));

    }
}
