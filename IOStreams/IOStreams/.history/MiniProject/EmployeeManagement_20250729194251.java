import java.io.*;
import java.util.*;

public class EmployeeManagement {

    static final String filename = "employees.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee(sc);
                    break;
                case 2:
                    displayAll();
                    break;
                case 3:
                    System.out.println("Exiting the System");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void addEmployee(Scanner sc) {
        try {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, age, salary);

            FileWriter fw = new FileWriter(filename, true);  
            fw.write(emp.toString() + "\n");
            fw.close();

            System.out.println("Employee Added Successfully");

        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }

    public static void displayAll() {
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                System.out.println("No employees found 😢");
                return;
            }

            System.out.println("\n----Report----");
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();

        } catch (IOException e) {
            System.out.println("Something went wrong while reading the file 💔");
        }
    }
}
