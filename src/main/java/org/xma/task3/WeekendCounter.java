package org.xma.task3;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekendCounter {

    public static int count(LocalDate startDate, LocalDate endDate) {
        int weekdays = 0;
        endDate = endDate.plusDays(1);
        while (startDate.isBefore(endDate)) {
            if (DayOfWeek.SATURDAY.equals(startDate.getDayOfWeek()) || DayOfWeek.SUNDAY.equals(startDate.getDayOfWeek())) {
                weekdays++;
            }
            startDate = startDate.plusDays(1);
        }

        return weekdays;
    }
}
