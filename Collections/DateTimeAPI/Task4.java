import java.time.Year;

public class Task4 {
    public static void main(String[] args) {
        // Get the current year
        int currentYear = Year.now().getValue();

        // Check if it is a leap year
        if (Year.isLeap(currentYear)) {
            System.out.println(currentYear + " is a Leap Year.");
        } else {
            System.out.println(currentYear + " is not a Leap Year.");
        }
    }
}
