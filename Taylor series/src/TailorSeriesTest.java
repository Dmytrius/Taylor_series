import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TailorSeriesTest {

    TailorSeries tsTest = new TailorSeries();

    @Test
    void getTailorSeries() {
        assertEquals(2.6666666666666665, tsTest.getTailorSeries(1, 1, 1, 4));
    }
}