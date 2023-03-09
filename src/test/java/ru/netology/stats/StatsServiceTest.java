package ru.netology.stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    //Чтобы в каждый тест не дублировать массив, выносим его в отдельную переменную
    protected long[] testingArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    void shouldCalcSumSalesExact() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.sumSales(testingArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcAvgSumSalesExact() {
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.avgSumSales(testingArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMaxSalesExact() {
        StatsService service = new StatsService();
        long expected = 8;
        long actual = service.maxSales(testingArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMinSalesExact() {
        StatsService service = new StatsService();
        long expected = 9;
        long actual = service.minSales(testingArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMinSalesCountExact() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.minSalesCount(testingArray);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMaxSalesCountExact() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.maxSalesCount(testingArray);
        Assertions.assertEquals(expected, actual);
    }
}
