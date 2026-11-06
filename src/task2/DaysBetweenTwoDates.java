
package task2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysBetweenTwoDates {

    public static long calculateDays(
            int year_from, int month_from, int day_from,
            int year_to, int month_to, int day_to) {

             LocalDate from = LocalDate.of(year_from, month_from, day_from);
             LocalDate to = LocalDate.of(year_to, month_to, day_to);

             return ChronoUnit.DAYS.between(from, to);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter starting date (year month day):");
        int year_from = input.nextInt();
        int month_from = input.nextInt();
        int day_from = input.nextInt();

        System.out.println("Enter ending date (year month day):");
        int year_to = input.nextInt();
        int month_to = input.nextInt();
        int day_to = input.nextInt();

        try {
            long days = calculateDays(
                    year_from, month_from, day_from,
                    year_to, month_to, day_to);

            System.out.println("Days between dates: " + days);
        }
            catch (java.time.DateTimeException e) {

            System.out.println("Invalid date entered.");
        }

        input.close();
    }
}
