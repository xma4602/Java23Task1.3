package org.xma.task4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class IsoWeekFormatter {

    public static final int MIN_YEAR_NUMBER = 0;
    public static final int MIN_WEEK_NUMBER = 1;
    public static final int MAX_WEEK_NUMBER = 53;

    public static String[] format(int yearNumber, int weekNumber){
        if (yearNumber < MIN_YEAR_NUMBER){
            throw new IllegalArgumentException("Номер года должен быть больше или равен нуля, а был " + yearNumber);
        }
        if (weekNumber < MIN_WEEK_NUMBER || weekNumber > MAX_WEEK_NUMBER){
            throw new IllegalArgumentException("Номер недели должен быть в диапазоне от %d до %d, а был %d"
                    .formatted(MIN_WEEK_NUMBER, MAX_WEEK_NUMBER, weekNumber));
        }
        LocalDate[] dates = IsoWeek.getWeekDates(yearNumber, weekNumber);
        DateTimeFormatter formatter = DateTimeFormatter.ISO_WEEK_DATE;
        return Arrays.stream(dates).map(formatter::format).toArray(String[]::new);
    }
}
