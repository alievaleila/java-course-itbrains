package org.example.bankaccountsimulation;

public class BankAccount {

    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    double deposit(double amount) {
        balance += amount;
        return balance;
    }

    double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

    void showBalance() {
        System.out.println(getBalance());
    }


}
