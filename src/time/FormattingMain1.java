package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        String format = "yyyy년 MM월 dd일";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);

        String input = "2023년 12월 27일";
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println(parsedDate);
    }
}
