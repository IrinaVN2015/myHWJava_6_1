package ru.netology.myHWJava_6_1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.myHWJava_6_1.services.CalcMonthToRest;

public class CalcMonthToRestTest {

    @Test
    public void shouldCalcMonthToRestVar1() {
        CalcMonthToRest service = new CalcMonthToRest();

        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonthToRestVar2() {
        CalcMonthToRest service = new CalcMonthToRest();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }
}

