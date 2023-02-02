package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long i = 0; i < sales.length; i++) {
            sum = sum + sales[(int) i];
        }
        return sum;
    }

    public long calculateTheAverage(long[] sales) {
        long months = 0;
        long sum = 0;
        for (long i = 0; i < sales.length; i++) {
            sum = sum + sales[(int) i];
            months = months + 1;
        }
        long average = sum / months;
        return average;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 11;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        long average = calculateTheAverage(sales);
        int monthAmount = 0;
        for (long sale : sales) {
            if (sale < average) {
                monthAmount = monthAmount + 1;
            }
        }
        return monthAmount;
    }

    public int aboveAverageSales(long[] sales) {
        long average = calculateTheAverage(sales);
        int monthAmount = 0;
        for (long sale : sales) {
            if (sale > average) {
                monthAmount = monthAmount + 1;
            }
        }
        return monthAmount;
    }
}

