package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account(0);
        Integer origBalance = account.getBalance();
        assertThat(origBalance == 0);

        account.deposit(100);
        Integer finalBalance = account.getBalance();
        assertThat(finalBalance > origBalance);
    }

    @Test
    public void withdrawAnAmountToDecreaseTheBalance() {
        Account account = new Account(10);
        Integer origBalance = account.getBalance();
        assertThat(origBalance == 10);

        account.withdraw(20);
        Integer finalBalance = account.getBalance();
        assertThat(finalBalance < origBalance);
    }
}
