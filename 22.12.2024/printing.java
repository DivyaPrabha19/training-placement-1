import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer
        int myInt = scanner.nextInt();

        // Read a double
        double myDouble = scanner.nextDouble();
        scanner.nextLine(); // Consume the leftover newline

        // Read a string
        String myString = scanner.nextLine();

        scanner.close(); // Close the scanner

        // Print the values as per the required format
        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);
    }
}
