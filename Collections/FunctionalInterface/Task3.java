import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        // Step 1: Create ArrayList with 10 words
        ArrayList<String> words = new ArrayList<>();
        Collections.addAll(words, "madam", "hello", "level", "world", "noon", 
                                  "java", "civic", "python", "radar", "wow");

        // Step 2: Predicate to check for palindrome
        Predicate<String> isPalindrome = word -> 
            word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());

        // Step 3: Filter and collect palindromes
        ArrayList<String> palindromes = words.stream()
            .filter(isPalindrome)
            .collect(Collectors.toCollection(ArrayList::new));

        // Step 4: Print the result
        System.out.println("Palindrome words: " + palindromes);
    }
}
