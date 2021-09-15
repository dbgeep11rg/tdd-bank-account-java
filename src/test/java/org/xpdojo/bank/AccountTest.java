package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        Integer origBalance = account.getBalance();
        assertThat(origBalance == 0);

        account.deposit(100);
        Integer finalBalance = account.getBalance();
        assertThat(finalBalance > origBalance);
    }
}
