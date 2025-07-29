import java.util.*;
import java.util.stream.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 12, -5, -8, 7, -10, 4, -3, -6, 15, 0);

        // 1 & 2: Filter negative even numbers and store in new list
        ArrayList<Integer> negativeEvenList = numbers.stream()
            .filter(n -> n < 0 && n % 2 == 0)
            .collect(Collectors.toCollection(ArrayList::new));

        // 3: Print the result
        System.out.println("Negative even numbers: " + negativeEvenList);
    }
}
