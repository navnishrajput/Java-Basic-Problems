import java.util.Scanner;

public class NumberAnalyzer {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 < num2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + numbers[i] + ": ");

            if (isPositive(numbers[i])) {
                System.out.print("Positive");
                if (isEven(numbers[i])) {
                    System.out.println(" and Even");
                } else {
                    System.out.println(" and Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }

        int comparison = compare(numbers[0], numbers[4]);
        System.out.println("\nComparison of first and last elements:");
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[4]);

        if (comparison == 1) {
            System.out.println("First element is GREATER than last element");
        } else if (comparison == -1) {
            System.out.println("First element is LESS than last element");
        } else {
            System.out.println("First and last elements are EQUAL");
        }
    }
}