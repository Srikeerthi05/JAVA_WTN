import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        // Create a HashMap with name as key and phone number as value
        HashMap<String,Long> contacts = new HashMap<>();

        // Add contacts
        contacts.put("Alice", 9876543210L);
        contacts.put("Bob", 9123456780L);
        contacts.put("Charlie", 9988776655L);

        // a) Check if a particular name (key) exists
        String nameToCheck = "Alice";
        if (contacts.containsKey(nameToCheck)) {
            System.out.println(nameToCheck + " is in the contact list.");
        } else {
            System.out.println(nameToCheck + " is not in the contact list.");
        }

        // b) Check if a particular phone number (value) exists
        Long numberToCheck = 9123456780L;
        if (contacts.containsValue(numberToCheck)) {
            System.out.println("Phone number " + numberToCheck + " exists in the contact list.");
        } else {
            System.out.println("Phone number " + numberToCheck + " not found.");
        }

        // c) Use Iterator to loop through the map
        System.out.println("Contact List:");
        Iterator<Map.Entry<String, Long>> iterator = contacts.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Long> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }
}
