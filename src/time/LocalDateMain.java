package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2020, 1, 1);
        LocalDate localDate2 = localDate.plusDays(3);

        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
    }
}
