import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }

        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Error: Please enter a natural number (positive integer greater than 0).");
            return;
        }

        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result: " + recursiveSum);
        } else {
            System.out.println("Error: Results don't match!");
        }
    }

    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
}