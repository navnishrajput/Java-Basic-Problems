import java.util.Arrays;

public class NumberChecker3 {

    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        int temp = Math.abs(number);

        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] originalDigits = storeDigits(number);
        int[] reversedDigits = reverseDigitsArray(originalDigits);
        return areArraysEqual(originalDigits, reversedDigits);
    }

    public static boolean isDuckNumber(int number) {
        if (number == 0) return false;
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int testNumber = 12321;

        System.out.println("Number: " + testNumber);
        System.out.println("Digit Count: " + countDigits(testNumber));

        int[] digits = storeDigits(testNumber);
        System.out.println("Original Digits: " + Arrays.toString(digits));

        int[] reversed = reverseDigitsArray(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));

        System.out.println("Is Palindrome: " + isPalindrome(testNumber));
        System.out.println("Is Duck Number: " + isDuckNumber(testNumber));

        int testNumber2 = 123;
        int[] digits2 = storeDigits(testNumber2);
        System.out.println("Arrays Equal: " + areArraysEqual(digits, digits2));
    }
}