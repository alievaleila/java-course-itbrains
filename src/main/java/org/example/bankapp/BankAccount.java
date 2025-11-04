package org.example.bankapp;

import java.util.ArrayList;
import java.util.Random;

public class BankAccount {
    private String name;
    private String surname;
    private long id;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Long> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Long> cards) {
        this.cards = cards;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    ArrayList<Long> cards=new ArrayList<>();

    public void createCard(long id){
        cards.add(id);
        System.out.println(cards);
        Random card=new Random();
        Long cards = card.nextLong(0000000000000000,999999999999999999L);
    }

    public void showBalance(){
        System.out.println(balance);
    }













}
