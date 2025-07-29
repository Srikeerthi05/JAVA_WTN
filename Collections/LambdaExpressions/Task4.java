// Interface with one abstract method
interface WordCount {
    int count(String str);
}

// Class with main method
public class Task4 {
    public static void main(String[] args) {
        // Lambda expression to count words in a string
        WordCount wc = str -> {
            if (str == null || str.trim().isEmpty()) {
                return 0;
            }
            return str.trim().split("\\s+").length;
        };

        // Example string
        String sentence = "This is a simple Java program using lambda";

        // Invoke and display result
        int wordCount = wc.count(sentence);
        System.out.println("Number of words: " + wordCount);
    }
}
