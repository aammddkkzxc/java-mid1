package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate localDate = LocalDate.of(year,month,1);
        LocalDate localDate2 = localDate.plusMonths(1);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        int offsetWeekDays = dayOfWeek.getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa ");
        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("  ");
        }
        LocalDate dayIterator = localDate;
        while (dayIterator.isBefore(localDate2)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println(); }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
