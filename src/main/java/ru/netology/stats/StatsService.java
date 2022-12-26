package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {

        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
//        for (int i = 0; i < sales.length; i++) {
//            result += sales[i]; ( Использование метода for i)
//        }
        return result;
    }

    public long average(long[] sales) {

        long result = 0;

        for (long sale : sales) {
            result += sale;

        }
        return result / 12;
    }

    public int maxSales(long[] sales) {

        int maxMonth = 0;
        long maxSale = sales[0];

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                maxMonth = i;

            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {

        int minMonth = 0;
        long minSale = sales[0];

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] <= minSale) {
                minSale = sales[i];
                minMonth = i;

            }
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {

        int counter = 0;
        long averageSale = average(sales);

        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;

            }
        }
        return counter;
    }

    public int underAverage(long[] sales) {

        int counter = 0;
        long averageSale = average(sales);

        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}

