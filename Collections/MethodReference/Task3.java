// Functional interface with one abstract method
interface PrimeChecker {
    MyNumber check(int n);
}

// Class with parameterized constructor
class MyNumber {
    MyNumber(int n) {
        if (isPrime(n)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }

    // Method to check if a number is prime
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

// Main class
public class Task3 {
    public static void main(String[] args) {
        // Refer constructor using constructor reference
        PrimeChecker pc = MyNumber::new;

        // Call constructor via functional interface
        pc.check(17);
        pc.check(20);
    }
}
