package ru.netology.service;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CashbackHackServiceJUnit4Test {
    @Test
    public void shouldFailWhenAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}