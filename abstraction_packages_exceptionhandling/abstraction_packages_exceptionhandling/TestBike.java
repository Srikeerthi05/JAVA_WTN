import com.wipro.automobile.twowheeler.Hero;
import com.wipro.automobile.twowheeler.Honda;

public class TestBike {
    public static void main(String[] args) {
        Hero heroBike = new Hero();
        heroBike.getModelName();
        heroBike.getRegistrationNumber();
        heroBike.getOwnerName();
        heroBike.getSpeed();

        System.out.println("---------------------------");

        Honda hondaBike = new Honda();
        hondaBike.getModelName();
        hondaBike.getRegistrationNumber();
        hondaBike.getOwnerName();
        hondaBike.getSpeed();
    }
}
