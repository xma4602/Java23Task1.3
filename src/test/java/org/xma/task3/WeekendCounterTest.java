package org.xma.task3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class WeekendCounterTest {

    LocalDate[] dates1 = new LocalDate[]{
            LocalDate.parse("2023-11-01"),
            LocalDate.parse("2023-05-01"),
            LocalDate.parse("2023-01-01"),
            LocalDate.parse("2023-05-01"),
            LocalDate.parse("2023-05-07"),
            LocalDate.parse("2023-05-01"),
            LocalDate.parse("2023-05-01"),
            LocalDate.parse("2023-05-06"),
            LocalDate.parse("2023-05-06"),
            LocalDate.parse("2023-05-01"),
            LocalDate.parse("2023-01-01"),
    };
    LocalDate[] dates2 = new LocalDate[]{
            LocalDate.parse("2023-11-01"),
            LocalDate.parse("2023-05-03"),
            LocalDate.parse("2023-01-01"),
            LocalDate.parse("2023-05-06"),
            LocalDate.parse("2023-05-10"),
            LocalDate.parse("2023-05-07"),
            LocalDate.parse("2023-05-08"),
            LocalDate.parse("2023-05-07"),
            LocalDate.parse("2023-05-09"),
            LocalDate.parse("2023-05-16"),
            LocalDate.parse("2023-12-31"),
    };
    int[] results = new int[]{
            0,
            0,
            1,
            1,
            1,
            2,
            2,
            2,
            2,
            4,
            105,
    };

    @Test
    void count() {
        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], WeekendCounter.count(dates1[i], dates2[i]));
        }
    }
}