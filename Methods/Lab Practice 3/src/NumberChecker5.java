import java.util.Arrays;

public class NumberChecker5 {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public static int findGreatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 1];
    }

    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long productOfFactors(int number) {
        int[] factors = findFactors(number);
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubeOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum < number;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        int testNumber = 28;

        System.out.println("Number: " + testNumber);

        int[] factors = findFactors(testNumber);
        System.out.println("Factors: " + Arrays.toString(factors));

        System.out.println("Greatest Factor: " + findGreatestFactor(testNumber));
        System.out.println("Sum of Factors: " + sumOfFactors(testNumber));
        System.out.println("Product of Factors: " + productOfFactors(testNumber));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(testNumber));
        System.out.println("Is Perfect Number: " + isPerfectNumber(testNumber));
        System.out.println("Is Abundant Number: " + isAbundantNumber(testNumber));
        System.out.println("Is Deficient Number: " + isDeficientNumber(testNumber));
        System.out.println("Is Strong Number: " + isStrongNumber(testNumber));

        System.out.println("\nTesting Strong Number with 145:");
        System.out.println("Is Strong Number: " + isStrongNumber(145));
    }
}