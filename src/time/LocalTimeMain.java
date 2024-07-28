package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(12, 5, 20);
        LocalTime localTime2 = LocalTime.now().plusHours(5);

        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);
    }
}
