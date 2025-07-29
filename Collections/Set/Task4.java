import java.util.*;

public class Task4 {
    // Instance variable
    TreeSet<String> H1 = new TreeSet<>();

    // Method to save country names
    public TreeSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    // Method to get a country by name
    public String getCountry(String countryName) {
        for (String country : H1) {
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }
        return null;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Task4 cs = new Task4();

        // Adding countries
        cs.saveCountryNames("India");
        cs.saveCountryNames("USA");
        cs.saveCountryNames("Germany");
        cs.saveCountryNames("Australia");

        // Displaying all countries
        System.out.println("All countries in TreeSet: " + cs.H1);

        // Searching for a country
        String searchCountry = "USA";
        String result = cs.getCountry(searchCountry);
        if (result != null) {
            System.out.println(searchCountry + " found in the TreeSet.");
        } else {
            System.out.println(searchCountry + " not found in the TreeSet.");
        }
    }
}
