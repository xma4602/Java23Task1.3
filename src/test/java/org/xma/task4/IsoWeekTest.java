package org.xma.task4;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class IsoWeekTest {

    int[] years = {1977, 1981, 2023};
    int[] weeks = {53, 53, 49};
    LocalDate[][] dates = {
            {LocalDate.parse("1978-01-02"), LocalDate.parse("1978-01-03"), LocalDate.parse("1978-01-04"), LocalDate.parse("1978-01-05"), LocalDate.parse("1978-01-06"), LocalDate.parse("1978-01-07"), LocalDate.parse("1978-01-08"),},
            {LocalDate.parse("1981-12-28"), LocalDate.parse("1981-12-29"), LocalDate.parse("1981-12-30"), LocalDate.parse("1981-12-31"), LocalDate.parse("1982-01-01"), LocalDate.parse("1982-01-02"), LocalDate.parse("1982-01-03"),},
            {LocalDate.parse("2023-12-04"), LocalDate.parse("2023-12-05"), LocalDate.parse("2023-12-06"), LocalDate.parse("2023-12-07"), LocalDate.parse("2023-12-08"), LocalDate.parse("2023-12-09"), LocalDate.parse("2023-12-10"),},
    };


    @Test
    void getWeekDates() {
        for (int i = 0; i < years.length; i++) {
            LocalDate[] weekDates = IsoWeek.getWeekDates(years[i], weeks[i]);
            assertArrayEquals(dates[i], weekDates);
        }
    }
}