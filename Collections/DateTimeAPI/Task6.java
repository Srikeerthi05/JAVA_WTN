import java.time.LocalTime;

public class Task6 {
    public static void main(String[] args) {
        // Get current time
        LocalTime currentTime = LocalTime.now();

        // Subtract 5 hours and 30 minutes
        LocalTime timeBefore = currentTime.minusHours(5).minusMinutes(30);

        // Display both times
        System.out.println("Current time: " + currentTime);
        System.out.println("Time before 5 hours 30 minutes: " + timeBefore);
    }
}
