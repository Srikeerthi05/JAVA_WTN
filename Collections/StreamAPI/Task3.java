import java.util.*;
import java.util.stream.*;

class Student {
    int rollNo;
    String name;
    int mark;

    // Parameterized constructor
    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}

public class Task3 {
    public static void main(String[] args) {
        // 1. Add 5 Student objects
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 45));
        students.add(new Student(2, "Bob", 67));
        students.add(new Student(3, "Charlie", 52));
        students.add(new Student(4, "David", 39));
        students.add(new Student(5, "Eva", 74));

        // 2. Filter students with marks >= 50 and 3. get count
        long passedCount = students.stream()
            .filter(s -> s.mark >= 50)
            .count();

        // Print the result
        System.out.println("Number of students who cleared the test: " + passedCount);
    }
}
