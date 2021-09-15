package org.xpdojo.bank;

public class Account {
    private Integer balance;

    Account(int openingBalance) {
        balance = openingBalance;
    }

    public Integer getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
