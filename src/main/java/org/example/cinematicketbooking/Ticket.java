package org.example.cinematicketbooking;

import java.util.ArrayList;

public class Ticket {
    private String movieName;
    private int seatNumber;
    private double price;

    public Ticket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void showInfo(){
        System.out.println("Movie name: "+movieName+", seat number: "+ seatNumber+", price: "+price);
    }
}
