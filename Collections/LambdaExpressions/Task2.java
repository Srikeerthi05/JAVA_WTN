import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        // Add 10 words using addAll
        Collections.addAll(al, "apple", "banana", "cherry", "date", "elderberry",
                               "fig", "grape", "honeydew", "kiwi", "lemon");

        // Reverse the list
        Collections.reverse(al);

        // Print each word using lambda
        al.forEach(word -> System.out.println(word));
    }
}
