import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Employee class
class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Task4 {
    public static void main(String[] args) {
        // Step 1: Create and add Employee objects
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Alice", 9500));
        empList.add(new Employee(102, "Bob", 12000));
        empList.add(new Employee(103, "Charlie", 8700));
        empList.add(new Employee(104, "David", 11000));
        empList.add(new Employee(105, "Eva", 9800));

        // Step 2: Predicate to filter employees with salary < 10000
        Predicate<Employee> lowSalary = emp -> emp.getSalary() < 10000;

        // Step 3: Filter and print employee names with salary < 10000
        System.out.println("Employees with salary less than 10000:");
        empList.stream()
               .filter(lowSalary)
               .map(Employee::getName)
               .forEach(System.out::println);
    }
}
