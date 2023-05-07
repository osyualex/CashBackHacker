package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;


class CashbackHackServiceTest {
    @Test

    public void IfLessThan1000IsSpent() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);

    }

    @Test

    public void IfSpent1000() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }

    @Test

    public void IfSpent0() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);

    }

}