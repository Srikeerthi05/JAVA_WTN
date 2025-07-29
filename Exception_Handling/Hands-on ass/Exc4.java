import java.util.*;
class InvalidCountryException extends Exception{
    public InvalidCountryException(String message) {
        super(message);
    }
}
class Exc4{
    public static void register(String name, String country) throws InvalidCountryException{
        if(!country.equalsIgnoreCase("India")){
            throw new InvalidCountryException("User outside India cannot be registered.");
        }
        else{
            System.out.println("User registered successfully!");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Exc4 ug=new Exc4();
        String name=sc.nextLine();
        String country=sc.nextLine();
        try {
            ug.register(name, country);
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}