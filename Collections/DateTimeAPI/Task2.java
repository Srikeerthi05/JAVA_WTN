import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task2 {
    public static void main(String[] args) {
        // Step 1: Get the first day of next month
        LocalDate today = LocalDate.now();
        LocalDate firstDayNextMonth = today.plusMonths(1).withDayOfMonth(1);

        // Step 2: Find the first Sunday
        LocalDate firstSunday = firstDayNextMonth;
        while (firstSunday.getDayOfWeek() != DayOfWeek.SUNDAY) {
            firstSunday = firstSunday.plusDays(1);
        }

        // Step 3: Add 7 days to get the second Sunday
        LocalDate secondSunday = firstSunday.plusDays(7);

        // Step 4: Print the result
        System.out.println("Second Sunday of next month: " + secondSunday);
    }
}
