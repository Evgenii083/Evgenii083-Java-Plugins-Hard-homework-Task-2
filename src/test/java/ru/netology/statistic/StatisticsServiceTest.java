package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void anotherArrayForFindMax() {
        StatisticsService service = new StatisticsService();

        long[] incomeInBillions = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        long expected = 13;

        long actual = service.findMax(incomeInBillions);

        assertEquals(expected, actual);
    }



    @Test
    void currentMaxMoreThanIncome() {
        StatisticsService service = new StatisticsService();

        long[] incomeInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 3};
        long expected = 12;
        long actual = service.findMax(incomeInBillions);

        assertEquals(expected, actual);
    }
}