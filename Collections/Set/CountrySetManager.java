import java.util.HashSet;
import java.util.Iterator;

public class CountrySetManager {

    // Instance variable
    HashSet<String> H1 = new HashSet<>();

    // Method to add country names
    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    // Method to get a country if it exists
    public String getCountry(String countryName) {
        Iterator<String> iterator = H1.iterator();
        while (iterator.hasNext()) {
            String country = iterator.next();
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }
        return null;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        CountrySetManager manager = new CountrySetManager();

        // Add countries
        manager.saveCountryNames("India");
        manager.saveCountryNames("USA");
        manager.saveCountryNames("Germany");

        // Print the set
        System.out.println("All Countries: " + manager.H1);

        // Search for a country
        String search1 = manager.getCountry("USA");
        System.out.println("Search Result for 'USA': " + search1);

        String search2 = manager.getCountry("France");
        System.out.println("Search Result for 'France': " + search2);
    }
}
