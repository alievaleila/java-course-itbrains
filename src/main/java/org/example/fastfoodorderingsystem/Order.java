package org.example.fastfoodorderingsystem;

import java.net.ServerSocket;
import java.util.ArrayList;

public class Order {
    ArrayList<MenuItem> items=new ArrayList<>();

    ArrayList<MenuItem> addItem(MenuItem item){
        items.add(item);
        return items;
    }

    double calculateTotal(){
        double total=0;
        for(MenuItem i:items){
            total+= i.getPrice();
        }
        return total;
    }

    void showItem(){
        if(items.isEmpty()){
            System.out.println("Order list is empty.");
            return;
        }
        System.out.println("-----Order list-----");
        for(MenuItem item:items){
            System.out.println(item.getName()+ " - "+ item.getPrice()+ " AZN ");
        }
        System.out.println("Total amount "+ calculateTotal() +" AZN\n");


    }
}


