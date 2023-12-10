package org.xma.task2;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;

public class DifferenceUtc {
    public static String findDifference(String datetimeUtc, String timeZone1, String timeZone2) {
        ZonedDateTime dateTime = ZonedDateTime.parse(datetimeUtc);
        ZonedDateTime dateTime1 = dateTime.withZoneSameInstant(ZoneId.of(timeZone1));
        ZonedDateTime dateTime2 = dateTime.withZoneSameInstant(ZoneId.of(timeZone2));

        long years = dateTime1.get(ChronoField.YEAR) - dateTime2.get(ChronoField.YEAR);
        if (years != 0) return "YEAR";
        long months = dateTime1.get(ChronoField.MONTH_OF_YEAR) - dateTime2.get(ChronoField.MONTH_OF_YEAR);
        if (months != 0) return "MONTH";
        long days = dateTime1.get(ChronoField.DAY_OF_MONTH) - dateTime2.get(ChronoField.DAY_OF_MONTH);
        if (days != 0) return "DAY";
        long hours = dateTime1.get(ChronoField.HOUR_OF_DAY) - dateTime2.get(ChronoField.HOUR_OF_DAY);
        if (hours != 0) return "HOUR";
        return "0";
    }
}
