package org.example.cinematicketbooking;

import java.util.Scanner;

public class CinemaTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cinema c = new Cinema();


        while (true) {
            System.out.println("-----Cinema Ticket Booking System-----");
            System.out.println("1.Buy a standard ticket");
            System.out.println("2.Buy a premium ticket");
            System.out.println("3.Show all tickets");
            System.out.println("4.Exit");

            System.out.println("Enter your choice, 1-4");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the movie name: ");
                    String movieName1 = sc.nextLine();
                    System.out.println("Enter the seat number: ");
                    int seatNumber1 = sc.nextInt();
                    c.bookTicket(new StandardTicket(movieName1, seatNumber1));
                    break;
                case 2:
                    System.out.println("Enter the movie name: ");
                    String movieName2 = sc.nextLine();
                    System.out.println("Enter the seat number: ");
                    int seatNumber2 = sc.nextInt();
                    c.bookTicket(new PremiumTicket(movieName2, seatNumber2));
                    break;
                case 3:
                    c.showTickets();
                    break;
                case 4:
                    System.out.println("Exited successfully.");
                    return;
                default:
                    System.out.println("Invalid choice");


            }
        }
    }
}
