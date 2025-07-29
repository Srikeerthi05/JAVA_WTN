import java.util.*;
import java.util.function.Function;

class Employee {
    int id;
    String name;
    String location;
    double salary;

    // Constructor
    Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class Task1 {
    public static void main(String[] args) {
        // Create list of 5 employees
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Alice", "Pune", 50000));
        empList.add(new Employee(102, "Bob", "Mumbai", 60000));
        empList.add(new Employee(103, "Charlie", "Delhi", 55000));
        empList.add(new Employee(104, "David", "Pune", 65000));
        empList.add(new Employee(105, "Eva", "Bangalore", 70000));

        // Functional interface to extract location
        Function<Employee, String> getLocation = e -> e.location;

        // New ArrayList to store locations
        ArrayList<String> locations = new ArrayList<>();

        // Apply function and store results
        for (Employee e : empList) {
            locations.add(getLocation.apply(e));
        }

        // Print the locations
        System.out.println("Employee Locations: " + locations);
    }
}
