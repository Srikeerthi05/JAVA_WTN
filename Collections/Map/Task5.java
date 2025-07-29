import java.util.*;

public class Task5 {
    // Using TreeMap instead of HashMap
    TreeMap<String, String> M1 = new TreeMap<>();

    // 1. Save country and capital
    public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // 2. Get capital by country name
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // 3. Get country by capital name
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // 4. Create a reverse map (Capital as key, Country as value)
    public TreeMap<String, String> reverseMap() {
        TreeMap<String, String> M2 = new TreeMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // 5. Create an ArrayList of country names
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }

    // Main method to test
    public static void main(String[] args) {
        Task5 mapObj = new Task5();

        // Adding countries and capitals
        mapObj.saveCountryCapital("India", "Delhi");
        mapObj.saveCountryCapital("Japan", "Tokyo");
        mapObj.saveCountryCapital("Australia", "Canberra");

        // 2. Get capital
        System.out.println("Capital of India: " + mapObj.getCapital("India"));

        // 3. Get country by capital
        System.out.println("Country with capital Tokyo: " + mapObj.getCountry("Tokyo"));

        // 4. Reverse map
        TreeMap<String, String> reversedMap = mapObj.reverseMap();
        System.out.println("Reversed Map (Capital -> Country): " + reversedMap);

        // 5. List of countries
        ArrayList<String> countries = mapObj.getAllCountries();
        System.out.println("List of Countries (Sorted): " + countries);
    }
}
