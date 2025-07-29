import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        // Add 10 words using addAll
        Collections.addAll(al, "apple", "banana", "cat", "dog", "elephant",
                               "fish", "grape", "hat", "ice", "jungle");

        System.out.println("Words with odd length:");

        // Simple loop to check and print words with odd length
        for (String word : al) {
            if (word.length() % 2 != 0) {
                System.out.println(word);
            }
        }
        //Anotherway
        // al.stream().filter(word -> word.length() % 2 != 0)
            //.forEach(word -> System.out.println(word));
    }
}
