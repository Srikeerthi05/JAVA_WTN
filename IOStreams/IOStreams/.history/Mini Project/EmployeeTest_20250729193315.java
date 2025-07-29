import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;


public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter date of birth (yyyy-mm-dd): ");
            String dobInput = sc.nextLine();
            Date dob = new SimpleDateFormat("yyyy-MM-dd").parse(dobInput);

            System.out.print("Enter department: ");
            String dept = sc.nextLine();

            System.out.print("Enter designation: ");
            String desig = sc.nextLine();

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(name, dob, dept, desig, salary);

          
            FileOutputStream fos = new FileOutputStream("data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();
            fos.close();
            System.out.println("\nObject has been serialized and saved to file 'data'.");

           
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
