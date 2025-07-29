import java.util.*;
import java.util.function.Consumer;

public class Task6{
    public static void main(String[] args) {
        // Step 1: Create ArrayList with 10 words
        ArrayList<String> words = new ArrayList<>();
        Collections.addAll(words, "apple", "banana", "car", "dog", "elephant",
                                  "fish", "grape", "hat", "ice", "juice");

        // Step 2: Consumer to reverse each word and update the list
        Consumer<ArrayList<String>> reverseWords = list -> {
            for (int i = 0; i < list.size(); i++) {
                String original = list.get(i);
                String reversed = new StringBuilder(original).reverse().toString();
                list.set(i, reversed); // Update the word in the list
            }
        };

        // Step 3: Apply the consumer
        reverseWords.accept(words);

        // Step 4: Print the updated list
        System.out.println("Reversed words: " + words);
    }
}
