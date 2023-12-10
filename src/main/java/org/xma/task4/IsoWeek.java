package org.xma.task4;

import java.time.*;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class IsoWeek {
    public static LocalDate[] getWeekDates(int yearNumber, int weekNumber) {
        LocalDate[] dates = new LocalDate[7];
        dates[0] = LocalDate
                .of(yearNumber, 2, 1)
                .with(WeekFields.of(Locale.getDefault()).getFirstDayOfWeek())
                .with(WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear(), weekNumber);
        for (int i = 1; i < dates.length; i++) {
            dates[i] = dates[i - 1].plusDays(1);
        }
        return dates;
    }

}
