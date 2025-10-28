package org.example.enums.marketproductsystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products=new ArrayList<>();

        products.add(new Product("Apple",60,Category.FOOD));
        products.add(new Product("Cola",20,Category.DRINK));
        products.add(new Product("Soap",20,Category.CLEANING));
        products.add(new Product("Book",90,Category.OTHER));

        for(Product product:products){
            System.out.println(product);
        }

        for(Product product: products) {
            if (product.getCategory() == Category.FOOD) {
                product.getInfo();
            }
        }

    }
}
