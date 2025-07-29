// Custom functional interface
interface MyFactorial {
    int compute(int n);
}

// Class with instance method
class MyMath {
    public int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

// Main class
public class Task1 {
    public static void main(String[] args) {
        MyMath math = new MyMath(); // Create object

        // Refer instance method using method reference
        MyFactorial mf = math::factorial;

        // Call the method
        int num = 5;
        int fact = mf.compute(num);
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
