import java.util.*;

public class Task6{

    // Method to print all elements using an Iterator
    public static void printAll(Vector<String> list) {
        Iterator<String> iterator = list.iterator();
        System.out.println("Elements in the Vector:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        // Create a Vector to store only Strings
        Vector<String> stringList = new Vector<>();

        // Add some strings
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Print all elements using the printAll method
        printAll(stringList);
    }
}
