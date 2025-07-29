import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Date of joining
        System.out.print("Enter your Wipro joining date (yyyy-mm-dd): ");
        String input = sc.nextLine();
        LocalDate joiningDate = LocalDate.parse(input);

        // Today's date
        LocalDate today = LocalDate.now();

        // Calculate experience
        Period experience = Period.between(joiningDate, today);

        // Display result
        System.out.println("Experience in Wipro:");
        System.out.println(experience.getYears() + " years, " +
                           experience.getMonths() + " months, " +
                           experience.getDays() + " days.");
    }
}
