import java.util.*;
import java.util.function.Consumer;

public class Task7 {
    public static void main(String[] args) {
        // Step 1: Create ArrayList with 10 numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Step 2: Define a Consumer to print number with odd/even
        Consumer<Integer> checkOddEven = n -> {
            if (n % 2 == 0) {
                System.out.println(n + " even");
            } else {
                System.out.println(n + " odd");
            }
        };

        // Step 3: Apply Consumer to each element
        numbers.forEach(checkOddEven);
    }
}
