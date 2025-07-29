import java.io.*;
import java.util.*;

public class FileWordCount {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileWordCount inputFile.txt outputFile.txt");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        Map<String, Integer> wordCount = new TreeMap<>(); // Sorted map

        try {
            // Read input file
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split by space
                for (String word : words) {
                    word = word.trim(); // Clean up
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
            br.close();

            // Write to output file
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                bw.write(entry.getKey() + " : " + entry.getValue());
                bw.newLine();
            }
            bw.close();

            System.out.println("Word count written to " + outputFile);

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
