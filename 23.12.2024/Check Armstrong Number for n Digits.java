import java.util.Scanner;

public class ArmstrongNumberN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num, sum = 0, digits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        System.out.println(original + " is " + (original == sum ? "an Armstrong number" : "not an Armstrong number"));
    }
}
