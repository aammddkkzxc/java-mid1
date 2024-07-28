package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class zonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println(nowZdt);

        LocalDateTime nowLdt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(nowLdt, ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0,
                ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime1);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("UTC"));
        ZonedDateTime zonedDateTime3 = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Europe/Berlin"));
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);

    }
}
