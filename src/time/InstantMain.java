package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        Instant instantNow = Instant.now();
        ZonedDateTime zdt = ZonedDateTime.now();

        Instant zdtToInstant = Instant.from(zdt);
        Instant zdtToInstant2 = zdt.toInstant();

        System.out.println(zdtToInstant);
        System.out.println(zdtToInstant2);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println(epochStart);

        Instant later = epochStart.plusSeconds(3600);
        System.out.println(later);

        long laterEpochSecond = later.getEpochSecond();
        System.out.println(laterEpochSecond);
    }
}
