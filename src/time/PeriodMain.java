package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        Period period = Period.ofDays(10);

        LocalDate localDate = LocalDate.of(2024, 5, 12);
        LocalDate localDate1 = localDate.plus(period);

        LocalDate startDate = LocalDate.of(2024, 5, 12);
        LocalDate endDate = LocalDate.of(2024, 5, 12);
        Period period1 = Period.between(localDate, startDate);

        System.out.println(period1);
        System.out.println("기간: " + period1.getMonths() + "개월 " +
                period1.getDays() + "일");
    }
}
