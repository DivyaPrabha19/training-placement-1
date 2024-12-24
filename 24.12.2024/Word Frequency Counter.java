import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String filePath = "input.txt"; // Provide the path of the text file

        Map<String, Integer> wordCountMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.toLowerCase().replaceAll("[^a-z]", "");
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
            wordCountMap.forEach((word, count) -> System.out.println(word + ": " + count));
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
