// Custom functional interface
interface DigitCounter {
    int count(int n);
}

// Class with static method
class MyUtil {
    public static int digitCount(int n) {
        int count = 0;
        if (n == 0) return 1; // Special case for 0

        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}

// Main class
public class Task2 {
    public static void main(String[] args) {
        // Refer static method using method reference
        DigitCounter dc = MyUtil::digitCount;

        // Test the method
        int num = 12345;
        int digits = dc.count(num);
        System.out.println("Number of digits in " + num + " is: " + digits);
    }
}
