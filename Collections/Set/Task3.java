import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        // Create a TreeSet and add some strings
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("Mango");

        // a) Reverse the elements
        TreeSet<String> reversedSet = new TreeSet<>(Collections.reverseOrder());
        reversedSet.addAll(treeSet);
        System.out.println("Reversed TreeSet: " + reversedSet);

        // b) Iterate using Iterator
        System.out.println("Iterating TreeSet:");
        Iterator<String> it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // c) Check if a particular element exists
        String search = "Apple";
        if (treeSet.contains(search)) {
            System.out.println(search + " exists in the TreeSet.");
        } else {
            System.out.println(search + " does not exist in the TreeSet.");
        }
    }
}
