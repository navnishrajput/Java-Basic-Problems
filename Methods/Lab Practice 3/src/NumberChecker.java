public class NumberChecker {

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

    public static boolean isArmstrongNumber(int number) {
        if (number < 0) return false;
        int[] digits = storeDigits(number);
        int digitCount = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, digitCount);
        }

        return sum == number;
    }

    public static int[] findLargestAndSecondLargest(int number) {
        int[] digits = storeDigits(number);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int number) {
        int[] digits = storeDigits(number);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153;

        System.out.println("Number: " + number);
        System.out.println("Digit count: " + countDigits(number));

        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Is Duck number: " + isDuckNumber(number));
        System.out.println("Is Armstrong number: " + isArmstrongNumber(number));

        int[] largestResults = findLargestAndSecondLargest(number);
        System.out.println("Largest digit: " + largestResults[0]);
        System.out.println("Second largest digit: " + (largestResults[1] == Integer.MIN_VALUE ? "N/A" : largestResults[1]));

        int[] smallestResults = findSmallestAndSecondSmallest(number);
        System.out.println("Smallest digit: " + smallestResults[0]);
        System.out.println("Second smallest digit: " + (smallestResults[1] == Integer.MAX_VALUE ? "N/A" : smallestResults[1]));
    }
}