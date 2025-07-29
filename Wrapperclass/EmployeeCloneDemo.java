class Employee implements Cloneable {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void printDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

public class EmployeeCloneDemo {
    public static void main(String[] args) {
        try {
            // Create original employee object
            Employee emp1 = new Employee("John Doe", 101, 50000.0);
            // Clone the employee object
            Employee emp2 = (Employee) emp1.clone();
            emp1.setName("Jane Smith");
            emp1.setId(102);
            emp1.setSalary(60000.0);
            System.out.println("Original Employee (after modification):");
            emp1.printDetails();
            System.out.println("Cloned Employee:");
            emp2.printDetails();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}