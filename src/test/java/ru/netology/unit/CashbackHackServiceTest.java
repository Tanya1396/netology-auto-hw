package ru.netology.unit;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturnValidCashBack() {
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1001;

        int actual = cashback.remain(amount);
        int expected = 999;
        assertEquals(expected,actual);

    }
    @Test
    void shouldReturn0IfAmount1000(){
        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(expected,actual);

    }

}