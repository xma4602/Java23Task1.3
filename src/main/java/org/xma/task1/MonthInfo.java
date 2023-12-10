package org.xma.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthInfo {
    private final LocalDate date;

    public MonthInfo() {
        date = LocalDate.now();
    }

    public MonthInfo(LocalDate date) {
        this.date = date;
    }

    /**
     * Полное название месяца на русском языке.
     */
    public String getTitle() {
        return date.format(DateTimeFormatter.ofPattern("LLLL"));
    }

    /**
     * Номер месяца в виде числа
     *
     * @return (1 — январь, 2 — февраль, …)
     */
    public int getNumber() {
        return date.getMonthValue();
    }

    /**
     * День недели первого числа месяца в виде краткого текста.
     *
     * @return (пн, вт, ср, чт, пт, сб, вс)
     */
    public String getWeekdayOfFirstMonthDay() {
        return date.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault());
    }

    /**
     * Дата последнего дня месяца
     */
    public LocalDate getDateOfLastMonthDay() {
        return date.withDayOfMonth(getTotalDaysNumber());
    }

    /**
     * Количество дней в месяце
     */
    public int getTotalDaysNumber() {
        return date.lengthOfMonth();
    }

    /**
     * Номер квартала, к которому относится месяц, с годом и приставкой Q.
     * @return ("2023 Q1", "2023 Q2", "2023 Q3", "2023 Q4")
     */
    public String getQuartNumber() {
        return "%d Q%d".formatted(
                date.getYear(),
                date.getMonthValue() / 3 + 1
        );
    }
}
