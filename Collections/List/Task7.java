import java.util.*;
// Employee class
class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // toString method to display employee info
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class Task7 {

    public static void main(String[] args) {
        // Create a Vector to store Employee objects
        Vector<Employee> empVector = new Vector<>();

        // Add some Employee objects
        empVector.add(new Employee(101, "Sai", 50000));
        empVector.add(new Employee(102, "Anu", 60000));
        empVector.add(new Employee(103, "Ravi", 55000));

        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<Employee> itr = empVector.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Using Enumeration
        System.out.println("\nUsing Enumeration:");
        Enumeration<Employee> e = empVector.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
