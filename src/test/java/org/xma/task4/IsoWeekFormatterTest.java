package org.xma.task4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.*;

class IsoWeekFormatterTest {

    int[] years = {1977, 1981, 2023};
    int[] weeks = {53, 53, 49};
    String[][] dates = {
            {"1978-W01-1", "1978-W01-2", "1978-W01-3", "1978-W01-4", "1978-W01-5", "1978-W01-6", "1978-W01-7",},
            {"1981-W53-1", "1981-W53-2", "1981-W53-3", "1981-W53-4", "1981-W53-5", "1981-W53-6", "1981-W53-7",},
            {"2023-W49-1", "2023-W49-2", "2023-W49-3", "2023-W49-4", "2023-W49-5", "2023-W49-6", "2023-W49-7",}
    };

    @Test
    void format() {
        for (int i = 0; i < years.length; i++) {
            String[] strings = IsoWeekFormatter.format(years[i], weeks[i]);
            assertArrayEquals(dates[i], strings);
        }
    }

    @Test
    void formatWithExceptions() {
        assertThrows(IllegalArgumentException.class, () -> IsoWeekFormatter.format(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> IsoWeekFormatter.format(2020, 0));
        assertThrows(IllegalArgumentException.class, () -> IsoWeekFormatter.format(-1, 0));

    }
}