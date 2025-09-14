import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        if (number < 0) {
            number = -number;
        }

        int[] digits = new int[50]; 
        int temp = number;
        int digitCount = 0;

        if (number == 0) {
            digits[0] = 0;
            digitCount = 1;
        } else {
            while (temp > 0) {
                int digit = temp % 10;
                digits[digitCount] = digit;
                digitCount++;
                temp = temp / 10;
            }
        }

        int[] frequency = new int[10];

        for (int i = 0; i < digitCount; i++) {
            int digit = digits[i];
            frequency[digit]++;
        }

        System.out.println("\nDigit frequency in " + originalNumber + ":");
        System.out.println("Digit : Frequency");
        System.out.println("-----------------");

        for (int digit = 0; digit < 10; digit++) {
            if (frequency[digit] > 0) {
                System.out.println(digit + "     : " + frequency[digit]);
            }
        }

        scanner.close();
    }
}