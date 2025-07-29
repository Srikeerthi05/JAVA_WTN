import java.io.*;
import java.util.*;

public class HandsOn3 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please enter the input and output file names!");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];
 
        Map<String, Integer> wordCount = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.trim();
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
            br.close();

            
            List<String> sortedWords = new ArrayList<>(wordCount.keySet());
            Collections.sort(sortedWords); 

            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            for (String word : sortedWords) {
                bw.write(word + " : " + wordCount.get(word));
                bw.newLine();
            }
            bw.close();

            System.out.println("Word count written to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
