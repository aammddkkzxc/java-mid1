package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeFieldMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("YEAR = " + localDateTime.get(ChronoField.YEAR));
        System.out.println("MONTH = " + localDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY = " + localDateTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR = " + localDateTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE = " + localDateTime.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECOND = " + localDateTime.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("YEAR = " + localDateTime.getYear());
        System.out.println("MONTH = " + localDateTime.getMonthValue());
        System.out.println("DAY = " + localDateTime.getDayOfMonth());
        System.out.println("HOUR = " + localDateTime.getHour());
        System.out.println("MINUTE = " + localDateTime.getMinute());
        System.out.println("SECOND = " + localDateTime.getSecond());

        System.out.println("편의 메서드에 없음");
        System.out.println("MINUTE_OF_DAY = " +
                localDateTime.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("SECOND_OF_DAY = " +
                localDateTime.get(ChronoField.SECOND_OF_DAY));
    }
}
