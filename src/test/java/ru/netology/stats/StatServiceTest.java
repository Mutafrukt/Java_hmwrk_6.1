package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {

    @Test
    public void shoulFindSum() {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();

        long expected = 180;
        long actual = service.sum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverage() {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();

        long expected = 15;
        long actual = service.avrg(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulFindNumberOfMonthWithMaxSales() {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();

        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindNumberOfMonthWithMinSales(){

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindLessThenAvrgSales(){

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();

        long expected = 5;
        long actual = service.lessThenAvrgSales(sales);

        Assertions.assertEquals(expected, actual);
    }


}
