package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {
        ChronoUnit[] units = ChronoUnit.values();
        for (ChronoUnit unit : units) {
            System.out.println(unit);
        }

        ChronoUnit unit = ChronoUnit.HOURS;
        System.out.println(unit);
        System.out.println(unit.getDuration().getSeconds());

        ChronoUnit unit1 = ChronoUnit.DAYS;
        System.out.println(unit1);
        System.out.println(unit1.getDuration().getSeconds());

        LocalTime startTime = LocalTime.of(12, 34, 56);
        LocalTime endTime = LocalTime.of(17, 42, 21);

        long dif1 = ChronoUnit.SECONDS.between(startTime, endTime);
        long dif2 = ChronoUnit.MINUTES.between(startTime, endTime);
        long dif3 = ChronoUnit.HOURS.between(startTime, endTime);

        System.out.println(dif1);
        System.out.println(dif2);
        System.out.println(dif3);
    }
}
