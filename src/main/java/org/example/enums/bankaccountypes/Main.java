package org.example.enums.bankaccountypes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(new BankAccount("Leyla", 500, AccountType.SAVINGS));
        accounts.add(new BankAccount("Ibrahim", 350, AccountType.FIXED));
        accounts.add(new BankAccount("Rovshan", 600, AccountType.CHECKING));

        for (BankAccount acc : accounts) {
            acc.showInfo();
        }
    }
}
