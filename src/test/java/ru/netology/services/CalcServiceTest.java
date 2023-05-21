package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceTest {
    @Test
    public void calculateTest() {
        CalcService Service = new CalcService();
        int actual = Service.calculate(10_000, 3_000, 20_000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateTest2() {
        CalcService Service = new CalcService();
        int actual = Service.calculate(100_000, 60_000, 150_000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "test_data.csv")
    public void testCalculateWithParams (int income, int expenses, int threshold, int expected) {
        CalcService Service = new CalcService();
        int actual = Service.calculate (income,expenses,threshold);
        Assertions.assertEquals(expected,actual);
    }
}