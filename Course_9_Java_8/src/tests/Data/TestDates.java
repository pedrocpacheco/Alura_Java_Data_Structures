package tests.Data;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TestDates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate rioOlimpics = LocalDate.of(2026, Month.JUNE, 5);
        System.out.println(rioOlimpics);

        Period period = Period.between(today, rioOlimpics);
        System.out.println(period.getDays());

        LocalDate nextOlimpics = rioOlimpics.plusYears(4);
        System.out.println(nextOlimpics);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String formattedValue = nextOlimpics.format(formatter);
        System.out.println(formattedValue);

    }
}
