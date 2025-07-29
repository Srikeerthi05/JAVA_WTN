import java.util.ArrayList;
import java.util.Iterator;

public class Task3{

    // Method to print all elements using an Iterator
    public static void printAll(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        System.out.println("Elements in the ArrayList:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an ArrayList that stores only Strings
        ArrayList<String> stringList = new ArrayList<>();

        // Add some strings
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Call printAll method
        printAll(stringList);
    }
}
