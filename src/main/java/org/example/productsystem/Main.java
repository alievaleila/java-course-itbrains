package org.example.productsystem;

public class Main {
    public static void main(String[] args) {
        Product f=new FoodProduct("Apple ",3,3);
        Product e=new ElectronicFood("Iron ",55,6);

        f.showInfo();
        e.showInfo();


    }
}
