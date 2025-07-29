import java.util.*;
import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {
        // Step 1: Create ArrayList with 10 numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50);

        // Step 2: Define a Function to calculate sum
        Function<ArrayList<Integer>, Integer> sumFunction = list -> {
            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            return sum;
        };

        // Step 3: Apply the function and print result
        int total = sumFunction.apply(numbers);
        System.out.println("Sum of all elements: " + total);
    }
}
