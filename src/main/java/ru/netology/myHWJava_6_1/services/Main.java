package ru.netology.myHWJava_6_1.services;

public class Main {
    public static void main(String[] args) {

        CalcMonthToRest service = new CalcMonthToRest();
        int actual = service.calculate(10000, 3000, 20000);
        System.out.println(actual);
    }
}