import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Random rand = new Random();

        // Add 25 random numbers (between 1 and 100)
        for (int i = 0; i < 25; i++) {
            al.add(rand.nextInt(100) + 1);
        }

        System.out.println("All Numbers: " + al);

        System.out.print("Prime Numbers: ");
        for (int n : al) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }

    // Method to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
