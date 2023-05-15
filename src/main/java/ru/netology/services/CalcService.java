package ru.netology.services;

public class CalcService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int counter = 0;
        for (int i = 0; i< 12; i++) {
            if (money >= threshold) {
                money = income - expenses;
                money = money / 3;
                counter = counter + 1;
            } else {
                money = money + income - expenses;
            }
        }
        return counter;
    }
}

