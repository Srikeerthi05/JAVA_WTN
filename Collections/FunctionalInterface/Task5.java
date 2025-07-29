import java.util.*;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        // Step 1: Create ArrayList with 10 numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 3, 4, 7, 9, 16, 20, 25, 26, 30, 36);

        // Step 2: Filter perfect squares
        ArrayList<Integer> perfectSquares = numbers.stream()
            .filter(n -> isPerfectSquare(n))
            .collect(Collectors.toCollection(ArrayList::new));

        // Step 3: Print the result
        System.out.println("Perfect square numbers: " + perfectSquares);
    }

    // Method to check if a number is a perfect square
    static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
