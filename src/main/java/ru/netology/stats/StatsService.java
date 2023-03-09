package ru.netology.stats;

public class StatsService {

    //Сумма всех продаж
    public long sumSales(long[] sales) {
        int sumMonth = 0;

        for (long sale : sales) {
            sumMonth += sale;
        }
        return sumMonth;
    }

    //Средняя сумма всех продаж
    public long avgSumSales(long[] sales) {
        return sumSales(sales) / 12;
    }

    //Номер месяца, в котором был максимум продаж
    public long maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж
    public long minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    //Количество месяцев, в которых продажи были ниже среднего
    public long minSalesCount(long[] sales) {
        long avgSumSales = avgSumSales(sales);
        int minSalesCount = 0;

        for (long sale : sales) {
            if (sale < avgSumSales) {
                minSalesCount++;
            }
        }
        return minSalesCount;
    }

    //Количество месяцев, в которых продажи были выше среднего
    public long maxSalesCount(long[] sales) {
        long avgSumSales = avgSumSales(sales);
        int maxSalesCount = 0;

        for (long sale : sales) {
            if (sale > avgSumSales) {
                maxSalesCount++;
            }
        }
        return maxSalesCount;
    }


}
