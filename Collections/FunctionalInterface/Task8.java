import java.util.*;
import java.util.function.Supplier;

public class Task8 {
    public static void main(String[] args) {
        // Step 1: Create a Supplier that returns ArrayList of first 10 prime numbers
        Supplier<ArrayList<Integer>> primeSupplier = () -> {
            ArrayList<Integer> primes = new ArrayList<>();
            int num = 2;

            while (primes.size() < 10) {
                if (isPrime(num)) {
                    primes.add(num);
                }
                num++;
            }

            return primes;
        };

        // Step 2: Get primes using supplier and print
        ArrayList<Integer> primeNumbers = primeSupplier.get();
        System.out.println("First 10 prime numbers: " + primeNumbers);
    }

    // Utility method to check if number is prime
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
