import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;
        int temp = number;

        System.out.println("\nChecking if " + number + " is an Armstrong number:");
        System.out.println("Step-by-step calculation:");

        // Process each digit
        while (temp > 0) {
            int digit = temp % 10;  // Get last digit
            int cube = digit * digit * digit;  // Calculate cube
            sum += cube;  // Add to sum

            System.out.println("Digit: " + digit + ", Cube: " + digit + "³ = " + cube + ", Sum so far: " + sum);

            temp = temp / 10;  // Remove last digit
        }

        System.out.println("\nFinal sum: " + sum);
        System.out.println("Original number: " + originalNumber);

        // Check if Armstrong number
        if (sum == originalNumber) {
            System.out.println("✓ " + originalNumber + " is an Armstrong number!");
        } else {
            System.out.println("✗ " + originalNumber + " is NOT an Armstrong number.");
        }
    }
}