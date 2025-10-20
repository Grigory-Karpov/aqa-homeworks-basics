package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTestNGTest {
    @Test
    public void testRemainWhenAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1000), 0);
    }
}