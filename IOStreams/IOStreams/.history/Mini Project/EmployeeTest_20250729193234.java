import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;


public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter date of birth (yyyy-mm-dd): ");
            String dobInput = scanner.nextLine();
            Date dob = new SimpleDateFormat("yyyy-MM-dd").parse(dobInput);

            System.out.print("Enter department: ");
            String dept = scanner.nextLine();

            System.out.print("Enter designation: ");
            String desig = scanner.nextLine();

            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();

            Employee emp = new Employee(name, dob, dept, desig, salary);

            // Serialize
            FileOutputStream fos = new FileOutputStream("data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();
            fos.close();
            System.out.println("\n✅ Object has been serialized and saved to file 'data'.");

            // Deserialize
            FileInputStream fis = new FileInputStream("data");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee deserializedEmp = (Employee) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("\n✅ Object has been deserialized successfully.");
            System.out.println(deserializedEmp);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
