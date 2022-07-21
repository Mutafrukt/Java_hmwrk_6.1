package ru.netology.stats;

public class StatService {

    /// сумма
    public long sum(long[] sales) {

        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    /// средняя выручка
    public long avrg(long[] sales) {
        long avrg = sum(sales) / sales.length;
        return avrg;
    }

    /// месяц пика продаж
    public long maxSales(long[] sales) {

        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    /// месяц с самыми низкими продажами
    public int minSales(long[] sales) {

        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    ///кол-во месяцев с продажами ниже среднего
    public long lessThenAvrgSales(long[] sales) {

        long avrg = avrg(sales);
        int months = 0;
        for (long sale : sales) {
            if (sale < avrg){
                months++;
            }
        }
        return months;
    }

    ///кол-во месяцев с продажами выше среднего
    public long moreThanAvrgSales(long[] sales) {

        long avrg = avrg(sales);
        int months = 0;
        for (long sale : sales) {
            if (sale > avrg){
                months++;
            }
        }
        return months;
    }
}


