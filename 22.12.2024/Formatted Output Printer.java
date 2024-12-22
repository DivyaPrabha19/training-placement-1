import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s = scanner.next(); // Read a string
            int n = scanner.nextInt(); // Read an integer

            // Print formatted output
            System.out.printf("%-15s%03d%n", s, n);
        }
        System.out.println("================================");

        scanner.close(); // Close the scanner
    }
}
