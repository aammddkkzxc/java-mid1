package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);

        LocalDateTime plusDt1 = dt.plus(10, ChronoUnit.YEARS);

        LocalDateTime plusDt2 = dt.plusYears(10);

        Period period = Period.ofYears(10);
        LocalDateTime plusDt3 = dt.plus(period);

        System.out.println(dt);
        System.out.println(plusDt1);
        System.out.println(plusDt2);
        System.out.println(plusDt3);

    }
}
