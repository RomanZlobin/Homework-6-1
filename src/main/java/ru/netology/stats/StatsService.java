package ru.netology.stats;

import java.lang.reflect.Method;

public class StatsService {

    public int sum(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;


        }
        return sum;
    }

    public double avg(double[] sales) {

        double avg = 0;
        for (double sale : sales) {
            avg += sale / 12;


        }
        return avg;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public double upperAVG(double[] sales) {

        double upperMonths = 0;
        for (double sale : sales) {
            if (sale > avg(sales)) {
                upperMonths = upperMonths + 1;
            }


        }
        return upperMonths;
    }

    public double underAVG(double[] sales) {

        double underMonths = 0;
        for (double sale : sales) {
            if (sale < avg(sales)) {
                underMonths = underMonths + 1;
            }


        }
        return underMonths;
    }
}
