import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Add 10 days to today's date
        LocalDate futureDate = today.plusDays(10);

        // Display both dates
        System.out.println("Today's date: " + today);
        System.out.println("Date after 10 days: " + futureDate);
    }
}
