import java.util.*;

public class EmployeeManagement {

    // Employee class
    static class Employee {
        int empId;
        String empName;
        String email;
        String gender;
        float salary;

        // Constructor
        public Employee(int empId, String empName, String email, String gender, float salary) {
            this.empId = empId;
            this.empName = empName;
            this.email = email;
            this.gender = gender;
            this.salary = salary;
        }

        // Print employee details
        public void getEmployeeDetails() {
            System.out.println("ID: " + empId);
            System.out.println("Name: " + empName);
            System.out.println("Email: " + email);
            System.out.println("Gender: " + gender);
            System.out.println("Salary: " + salary);
            System.out.println("-----------------------");
        }
    }

    // EmployeeDB class
    static class EmployeeDB {
        ArrayList<Employee> list = new ArrayList<>();

        // Add employee
        public boolean addEmployee(Employee e) {
            return list.add(e);
        }

        // Delete employee by empId
        public boolean deleteEmployee(int empId) {
            for (Employee e : list) {
                if (e.empId == empId) {
                    list.remove(e);
                    return true;
                }
            }
            return false;
        }

        // Show payslip
        public String showPaySlip(int empId) {
            for (Employee e : list) {
                if (e.empId == empId) {
                    return "Pay slip for " + e.empName + " is Rs." + e.salary;
                }
            }
            return "Employee not found.";
        }
    }

    // Main method
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Sai", "sai@gmail.com", "Male", 50000);
        Employee e2 = new Employee(102, "Anu", "anu@gmail.com", "Female", 60000);

        EmployeeDB db = new EmployeeDB();

        // Adding employees
        db.addEmployee(e1);
        db.addEmployee(e2);

        // Displaying employee details
        System.out.println("All Employees:");
        e1.getEmployeeDetails();
        e2.getEmployeeDetails();

        // Show payslip
        System.out.println(db.showPaySlip(101));

        // Deleting one employee
        db.deleteEmployee(101);

        // Try showing deleted employee's payslip
        System.out.println(db.showPaySlip(101));
    }
}
