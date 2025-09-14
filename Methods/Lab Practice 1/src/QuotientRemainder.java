import java.util.Scanner;

public class QuotientRemainder {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        try {
            int[] results = findRemainderAndQuotient(number, divisor);
            System.out.println("Quotient: " + results[0]);
            System.out.println("Remainder: " + results[1]);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}