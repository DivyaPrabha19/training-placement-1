import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueCharacterFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count character occurrences
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first unique character
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First unique character: " + entry.getKey());
                return;
            }
        }
        System.out.println("No unique characters found.");
    }
}
