package org.example.onlinestoresystem;

import java.util.ArrayList;

public class Store {

    ArrayList<Product> products=new ArrayList<>();

    void addProduct(Product p){
        products.add(p);
        System.out.println(products);
    }

    void showAllProducts(){
        for(Product p:products){
            System.out.println(p);
        }
    }
}
