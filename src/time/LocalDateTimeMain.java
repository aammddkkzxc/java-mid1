package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt1 = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        LocalDate ld = ldt.toLocalDate();
        LocalTime lt = ldt.toLocalTime();

        LocalDateTime ldt2 = LocalDateTime.of(ld, lt);

        LocalDateTime ldt3 = ldt1.plusDays(5);
        LocalDateTime ldt4 = ldt1.plusYears(1);

        boolean bool = ldt1.isBefore(ldt2);
        boolean bool1 = ldt2.isAfter(ldt3);
        boolean bool2 = ldt3.isEqual(ldt4);
        boolean bool3 = ldt4.equals(ldt);
    }
}
