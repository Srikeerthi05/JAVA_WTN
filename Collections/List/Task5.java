import java.util.LinkedList;
import java.util.Iterator;

public class Task5 {

    public static void printAll(LinkedList<String> cities) {
        Iterator<String> iterator = cities.iterator();
        System.out.println("Cities in the LinkedList:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        
        LinkedList<String> cityList = new LinkedList<>();

        // Add some cities
        cityList.add("Hyderabad");
        cityList.add("Mumbai");
        cityList.add("Chennai");
        cityList.add("Bangalore");

        // Print all cities
        printAll(cityList);
    }
}
