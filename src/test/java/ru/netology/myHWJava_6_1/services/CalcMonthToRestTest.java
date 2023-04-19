package ru.netology.myHWJava_6_1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.myHWJava_6_1.services.CalcMonthToRest;

public class CalcMonthToRestTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")
    public void shouldCalcMonthToRestVar1(int expected, int income, int expenses, int threshold) {
        CalcMonthToRest service = new CalcMonthToRest();

        // int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

 /*   @Test
    public void shouldCalcMonthToRestVar2() {
        CalcMonthToRest service = new CalcMonthToRest();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }
  */
}

