import java.util.Arrays;

public class NumberChecker4{

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }

    public static int[] getDigits(int number) {
        int count = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        temp = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int digitSum = sumOfDigits(square);
        return digitSum == number;
    }

    public static boolean isSpyNumber(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        int product = 1;
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int number) {
        long square = (long) number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    public static void main(String[] args) {
        int[] testNumbers = {7, 9, 1124, 25, 28};

        for (int num : testNumbers) {
            System.out.println("\nNumber: " + num);
            System.out.println("Is Prime: " + isPrime(num));
            System.out.println("Is Neon: " + isNeonNumber(num));
            System.out.println("Is Spy: " + isSpyNumber(num));
            System.out.println("Is Automorphic: " + isAutomorphicNumber(num));
            System.out.println("Is Buzz: " + isBuzzNumber(num));
        }
    }
}