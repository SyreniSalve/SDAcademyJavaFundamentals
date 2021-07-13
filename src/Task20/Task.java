package Task20;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Task {
    public static void main(String[] args) {
        System.out.println(calculateDifference ("2014::01::23", "03-2020-30" ));

    }

    public static int[] calculateDifference(String dateA, String dateB) {
        DateTimeFormatter dateTimeFormatterA = DateTimeFormatter.ofPattern("yyyy::MM::dd");
        DateTimeFormatter dateTimeFormatterB = DateTimeFormatter.ofPattern("MM--yyyy-dd");

        LocalDate localDate1 = LocalDate.parse(dateA, dateTimeFormatterA);
        LocalDate localDate2 = LocalDate.parse(dateB, dateTimeFormatterB);

        Period period = Period.between(localDate1,localDate2);

        return new int[]{period.getYears(), period.getMonths(), period.getDays()};
    }
}
