import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1; // Start numbering from 1

        // Loop until there are no more lines to read
        while (scanner.hasNext()) {
            // Read each line and print with the line number
            System.out.println(lineNumber + " " + scanner.nextLine());
            lineNumber++; // Increment line number for the next line
        }

        scanner.close(); // Close the scanner when done
    }
}
