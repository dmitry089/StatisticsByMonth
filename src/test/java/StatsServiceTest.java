
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void mustFindSumNumbers() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(sale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateTheAverage() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateTheAverage(sale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMin() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMin = 9;
        int actualMin = service.minSales(sale);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void shouldFindMax() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMax = 8;
        int actualMax = service.maxSales(sale);
        Assertions.assertEquals(expectedMax, actualMax);
    }
    @Test
    public void shouldCountBelowAverage () {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected =5;
        int actual = service.belowAverageSales(sale);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldCountAboveAverage () {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected =5;
        int actual = service.aboveAverageSales(sale);
        Assertions.assertEquals(expected,actual);
    }
}
