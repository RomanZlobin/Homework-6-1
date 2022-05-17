package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSum() {
        StatsService stats = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = stats.sum(sales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAVG() {
        StatsService stats = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double actual = stats.avg(sales);
        double expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService stats = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = stats.maxSales(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService stats = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = stats.minSales(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindUpperAVG() {
        StatsService stats = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double actual = stats.upperAVG(sales);
        double expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindUnderAVG() {
        StatsService stats = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double actual = stats.underAVG(sales);
        double expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
