package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] testingArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long sumSales = service.sumSales(testingArray);
        long avgSumSales = service.avgSumSales(testingArray);
        long maxSales = service.maxSales(testingArray);
        long minSales = service.minSales(testingArray);
        long minSalesCount = service.minSalesCount(testingArray);
        long maxSalesCount = service.maxSalesCount(testingArray);

        System.out.println(sumSales);
        System.out.println(avgSumSales);
        System.out.println(maxSales);
        System.out.println(minSales);
        System.out.println(minSalesCount);
        System.out.println(maxSalesCount);
    }
}