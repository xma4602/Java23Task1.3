package org.xma.task1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MonthInfoTest {

    MonthInfo[] months = new MonthInfo[]{
            new MonthInfo(LocalDate.of(2023, 11, 12)),
            new MonthInfo(LocalDate.of(1900, 01, 01)),
            new MonthInfo(LocalDate.of(2020, 02, 12)),
    };

    @Test
    void getTitle() {
        var titles = new String[]{"ноябрь", "январь", "февраль"};
        var mtitles = Arrays.stream(months).map(MonthInfo::getTitle).toArray(String[]::new);
        assertArrayEquals(titles, mtitles);
    }

    @Test
    void getNumber() {
        var numbers = new int[]{11, 1, 2};
        var mnumbers = Arrays.stream(months).mapToInt(MonthInfo::getNumber).toArray();
        assertArrayEquals(numbers, mnumbers);
    }

    @Test
    void getWeekdayOfFirstMonthDay() {
        var weekdays = new String[]{"вс", "пн", "ср"};
        var mweekdays = Arrays.stream(months).map(MonthInfo::getWeekdayOfFirstMonthDay).toArray(String[]::new);
        assertArrayEquals(weekdays, mweekdays);
    }

    @Test
    void getDateOfLastMonthDay() {
        var dates = new LocalDate[]{
                LocalDate.of(2023, 11, 30),
                LocalDate.of(1900, 1, 31),
                LocalDate.of(2020, 2, 29),
        };
        var mdates = Arrays.stream(months).map(MonthInfo::getDateOfLastMonthDay).toArray(LocalDate[]::new);
        assertArrayEquals(dates, mdates);
    }

    @Test
    void getTotalDaysNumber() {
        var numbers = new int[]{30, 31, 29};
        var mnumbers = Arrays.stream(months).mapToInt(MonthInfo::getTotalDaysNumber).toArray();
        assertArrayEquals(numbers, mnumbers);
    }

    @Test
    void getQuartNumber() {
        var quarts = new String[]{"2023 Q4", "1900 Q1", "2020 Q1"};
        var mquarts = Arrays.stream(months).map(MonthInfo::getQuartNumber).toArray(String[]::new);
        assertArrayEquals(quarts, mquarts);
    }
}