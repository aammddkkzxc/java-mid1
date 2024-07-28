package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println(dt);

        LocalDateTime dtChanged = dt.with(ChronoField.YEAR, 2020);
        System.out.println(dtChanged);

        LocalDateTime dtChanged2 = dt.withYear(2020);
        System.out.println(dtChanged2);

        LocalDateTime dtChanged3 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(dtChanged3);

        LocalDateTime dtChanged4 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
        System.out.println(dtChanged4);

    }
}
