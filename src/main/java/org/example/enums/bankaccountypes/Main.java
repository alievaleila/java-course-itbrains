package org.example.enums.bankaccountypes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final ArrayList<BankAccount> accounts = new ArrayList<>();

        BankAccount acc=new BankAccount("Leyla", 500, AccountType.SAVINGS);
        BankAccount acc1=new BankAccount("Ibrahim", 350, AccountType.FIXED);
        BankAccount acc2=new BankAccount("Rovshan", 600, AccountType.CHECKING);

        accounts.add(acc);
        accounts.add(acc1);
        accounts.add(acc2);

        acc.deposit(400);
        acc.withdraw(700);
        acc1.deposit(1000);
        acc1.withdraw(100);
        acc2.deposit(1200);

        for (BankAccount account : accounts) {
            account.showInfo();
        }
    }
}
