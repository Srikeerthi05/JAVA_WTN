import java.util.*;

class Employee implements Comparable<Employee> {
    String firstName, lastName, mobile, email, address;

    Employee(String firstName, String lastName, String mobile, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    public int compareTo(Employee e) {
        return this.firstName.compareToIgnoreCase(e.firstName);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the Number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee " + (i + 1) + " Details:");
            System.out.print("Enter the Firstname: ");
            String fn = sc.nextLine();
            System.out.print("Enter the Lastname: ");
            String ln = sc.nextLine();
            System.out.print("Enter the Mobile: ");
            String mob = sc.nextLine();
            System.out.print("Enter the Email: ");
            String mail = sc.nextLine();
            System.out.print("Enter the Address: ");
            String addr = sc.nextLine();

            list.add(new Employee(fn, ln, mob, mail, addr));
        }

        Collections.sort(list);

        System.out.println("\nEmployee List:");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
        for (Employee e : list) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n", e.firstName, e.lastName, e.mobile, e.email, e.address);
        }
    }
}
