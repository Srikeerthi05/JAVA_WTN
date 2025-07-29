import com.wipro.automobile.fourwheeler.Ford;
import com.wipro.automobile.fourwheeler.Logan;

public class TestCar {
    public static void main(String[] args) {
        Logan logan = new Logan();
        logan.getModelName();
        logan.getRegistrationNumber();
        logan.getOwnerName();
        System.out.println("Speed: " + logan.speed() + " km/h");
        logan.gps();

        System.out.println("----------------------------");

        Ford ford = new Ford();
        ford.getModelName();
        ford.getRegistrationNumber();
        ford.getOwnerName();
        System.out.println("Speed: " + ford.speed() + " km/h");
        System.out.println("AC Temperature: " + ford.tempControl() + "C");
    }
}
