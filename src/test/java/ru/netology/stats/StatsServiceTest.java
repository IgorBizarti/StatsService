package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test

    public void testSum (){

        StatsService service = new StatsService();

        long[] sales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.sum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testCalc (){

        StatsService service = new StatsService();

        long[] sales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180 / 12;
        long actual = service.average(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMax (){

        StatsService service = new StatsService();

        long[] sales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testMin (){

        StatsService service = new StatsService();

        long[] sales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);

    }


    @Test

    public void testBellow (){

        StatsService service = new StatsService();

        long[] sales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.belowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testUnder(){

        StatsService service = new StatsService();

        long[] sales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.underAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}