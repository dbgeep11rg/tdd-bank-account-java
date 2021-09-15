package org.xpdojo.bank;

public class Account {
    private Integer balance = 0;

    public Integer getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }
}
