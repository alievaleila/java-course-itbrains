package org.example.enums.bankaccountypes;

public class BankAccount {
    private String ownerName;
    private double balance;
    private AccountType accountType;

    public BankAccount(String ownerName, double balance, AccountType accountType) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    void deposit(double amount){
        balance+=amount;
        System.out.println(balance);;
    }

    void withdraw(double amount){
        balance-=amount;
        System.out.println(balance);;
    }

    void showInfo(){
        System.out.println("Owner name: "+ getOwnerName()+ " ,balance: "+ balance+" ,account type: "+accountType);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                ", accountType=" + accountType +
                '}';
    }
}
