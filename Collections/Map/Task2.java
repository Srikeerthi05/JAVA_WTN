import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        // Create a HashMap to store String key-value pairs
        HashMap<String, String> map = new HashMap<>();

        // Add some key-value pairs
        map.put("India", "Delhi");
        map.put("USA", "Washington");
        map.put("Japan", "Tokyo");

        // a) Check if a particular key exists
        String keyToCheck = "India";
        if (map.containsKey(keyToCheck)) {
            System.out.println("Key \"" + keyToCheck + "\" exists.");
        } else {
            System.out.println("Key \"" + keyToCheck + "\" does not exist.");
        }

        // b) Check if a particular value exists
        String valueToCheck = "Tokyo";
        if (map.containsValue(valueToCheck)) {
            System.out.println("Value \"" + valueToCheck + "\" exists.");
        } else {
            System.out.println("Value \"" + valueToCheck + "\" does not exist.");
        }

        // c) Use Iterator to loop through the map
        System.out.println("Iterating through the map:");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
 