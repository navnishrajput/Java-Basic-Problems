import java.util.Arrays;

public class NumberChecker2
{

    public static int countDigits(int number) {
        int count = 0;
        int temp = Math.abs(number);
        do {
            count++;
            temp = temp / 10;
        } while (temp > 0);
        return count;
    }

    public static int[] storeDigits(int number) {
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];
        int temp = Math.abs(number);
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        return digits;
    }

    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static double sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        if (number == 0) {
            return false;
        }
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    public static int[][] findDigitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[] frequency = new int[10];

        for (int digit : digits) {
            frequency[digit]++;
        }

        int count = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                count++;
            }
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;
                result[index][1] = frequency[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int testNumber = 212;

        System.out.println("Number: " + testNumber);
        System.out.println("Digit Count: " + countDigits(testNumber));

        int[] digitArray = storeDigits(testNumber);
        System.out.println("Digits: " + Arrays.toString(digitArray));

        System.out.println("Sum of Digits: " + sumOfDigits(testNumber));
        System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(testNumber));

        boolean isHarshad = isHarshadNumber(testNumber);
        System.out.println("Is Harshad Number: " + isHarshad);

        int[][] frequencyResult = findDigitFrequency(testNumber);
        System.out.println("Digit Frequencies:");
        for (int[] pair : frequencyResult) {
            System.out.println("Digit " + pair[0] + " appears " + pair[1] + " time(s)");
        }
    }
}