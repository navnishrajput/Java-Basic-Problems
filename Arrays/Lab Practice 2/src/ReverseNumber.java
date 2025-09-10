import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int temp = Math.abs(number);
        int count = 0;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        temp = Math.abs(number);

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }

        System.out.print("Reversed number: ");
        if (number < 0) {
            System.out.print("-");
        }

        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        scanner.close();
    }
}