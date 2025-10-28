package org.example.cinematicketbooking;

import java.util.ArrayList;

public class Cinema {

    ArrayList<Ticket> tickets=new ArrayList<>();

    public void bookTicket(Ticket ticket){
        tickets.add(ticket);
        System.out.println("Ticket is bought successfully.");
    }

    public void showTickets(){
        if(tickets.isEmpty()){
            System.out.println("Tickets have not been bought yet.");
        }else{
            System.out.println("Bought tickets: ");
            for(Ticket t:tickets){
                t.showInfo();
            }
        }
    }
}
