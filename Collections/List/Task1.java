import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<>();

        // Use addAll to add all the months at once
        months.addAll(Arrays.asList(
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        ));

        // Print the ArrayList
        System.out.println("Months of the year:");
        for (String month : months) {
            System.out.println(month);
        }
    }
}
