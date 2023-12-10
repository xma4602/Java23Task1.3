package org.xma.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DifferenceUtcTest {

    String[] dateTimes = new String[]{
            "2023-11-12T00:00:00Z",
            "2020-06-01T14:25:16Z",
            "2020-06-01T14:25:16Z",
            "2023-05-10T23:00:00Z",
            "2024-10-01T04:59:59Z",
            "2010-12-31T20:15:00Z",
    };
    String[] utc1 = new String[]{
            "UTC+00",
            "UTC+01",
            "UTC+05",
            "UTC-03",
            "UTC-08",
            "Europe/Moscow",
    };
    String[] utc2 = new String[]{
            "UTC+00",
            "UTC+02",
            "UTC+01",
            "UTC+04",
            "UTC-04",
            "Asia/Vladivostok",
    };
    String[] results = new String[]{
            "0",
            "HOUR",
            "HOUR",
            "DAY",
            "MONTH",
            "YEAR",
    };

    @Test
    void findDifference() {
        for (int i = 0; i < results.length; i++) {
            assertEquals(results[i], DifferenceUtc.findDifference(dateTimes[i], utc1[i], utc2[i]));
        }
    }
}