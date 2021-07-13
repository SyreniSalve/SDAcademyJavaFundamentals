package Task19;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
    public static void main(String[] args) {
        System.out.println(toLocalDate("yyyy/MM/dd", "2021/05/09"));
    }

    public static LocalDate toLocalDate(String pattern, String input) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(input, dateTimeFormatter);

    }
}
