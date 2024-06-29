package homework36.date_of_birth;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateOfBirth {
    public static void main(String[] args) {
        LocalDate dateofBirth = LocalDate.of(1979,11,16);
        System.out.println(dateofBirth.getDayOfYear());
        System.out.println(dateofBirth.getDayOfMonth());
        System.out.println(dateofBirth.getDayOfWeek());

        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
        System.out.println(dateofBirth.format(df));

        System.out.println("------------------------------");

        df = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.GERMAN);
        System.out.println(dateofBirth.format(df));

    }


    }


