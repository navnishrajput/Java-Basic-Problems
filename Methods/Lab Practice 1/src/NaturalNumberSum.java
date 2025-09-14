import java.util.Scanner;

public class NaturalNumberSum {

    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = sumOfNaturalNumbers(n);
            System.out.println("Sum of first " + n + " natural numbers: " + sum);
        }
    }
}