package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2020, 11, 21);

        Period period = Period.between(startDate, endDate);
        long days = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println(period.get(ChronoUnit.YEARS) + " " + period.get(ChronoUnit.MONTHS) + " " + period.get(ChronoUnit.DAYS));
        System.out.println(period.getYears() + " " + period.getMonths() + " " + period.getDays());
        System.out.println(days);
    }
}
