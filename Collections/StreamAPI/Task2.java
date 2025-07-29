import java.util.*;
import java.util.stream.Collectors;

// Employee class
class Employee {
    int empNo;
    String name;
    int age;
    String location;

    // Parameterized constructor
    Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    // Method to display employee details
    void display() {
        System.out.println("Emp No: " + empNo + ", Name: " + name + ", Age: " + age + ", Location: " + location);
    }
}

// Main class
public class Task2 {
    public static void main(String[] args) {
        // 1. Add 5 Employee objects
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", 28, "Pune"));
        employees.add(new Employee(102, "Bob", 30, "Delhi"));
        employees.add(new Employee(103, "Charlie", 25, "Pune"));
        employees.add(new Employee(104, "David", 35, "Mumbai"));
        employees.add(new Employee(105, "Eva", 26, "Pune"));

        // 2. Filter employees whose location is Pune
        ArrayList<Employee> puneEmployees = employees.stream()
            .filter(e -> e.location.equalsIgnoreCase("Pune"))
            .collect(Collectors.toCollection(ArrayList::new));

        // 3. Print filtered employee details
        System.out.println("Employees from Pune:");
        for (Employee e : puneEmployees) {
            e.display();
        }
    }
}
