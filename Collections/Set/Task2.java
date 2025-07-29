import java.util.HashSet;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        // Create a HashSet to store employee names
        HashSet<String> employeeNames = new HashSet<>();

        // Add employee names
        employeeNames.add("Sai");
        employeeNames.add("Anu");
        employeeNames.add("Ravi");
        employeeNames.add("Priya");
        employeeNames.add("John");

        // Retrieve and print names using Iterator
        System.out.println("Employee Names:");
        Iterator<String> iterator = employeeNames.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
