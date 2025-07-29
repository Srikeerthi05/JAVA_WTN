import java.time.LocalTime;

public class Task5 {
    public static void main(String[] args) {
        // Get current time
        LocalTime currentTime = LocalTime.now();

        // Add 25 minutes
        LocalTime timeAfter25Min = currentTime.plusMinutes(25);

        // Display both times
        System.out.println("Current time: " + currentTime);
        System.out.println("Time after 25 minutes: " + timeAfter25Min);
    }
}
