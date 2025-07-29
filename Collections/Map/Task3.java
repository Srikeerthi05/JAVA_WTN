import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        // Create a Properties object
        Properties states = new Properties();

        // Add state-capital pairs
        states.setProperty("Telangana", "Hyderabad");
        states.setProperty("Maharashtra", "Mumbai");
        states.setProperty("Karnataka", "Bengaluru");
        states.setProperty("Tamil Nadu", "Chennai");

        // Use Iterator to list all elements
        Set<Object> keys = states.keySet();
        Iterator<Object> it = keys.iterator();

        System.out.println("States and their Capitals:");
        while (it.hasNext()) {
            String state = (String) it.next();
            String capital = states.getProperty(state);
            System.out.println(state + " -> " + capital);
        }
    }
}
