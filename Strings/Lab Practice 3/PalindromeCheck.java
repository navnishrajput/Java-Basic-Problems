import java.util.Scanner;

public class PalindromeCheck {


    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }


    public static boolean isPalindromeCharArray(String text) {
        int len = text.length();
        char[] original = text.toCharArray();
        char[] reversed = new char[len];

        for (int i = 0; i < len; i++) {
            reversed[i] = text.charAt(len - 1 - i);
        }

        for (int i = 0; i < len; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = sc.nextLine();

        boolean resultIterative = isPalindromeIterative(input);
        boolean resultRecursive = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean resultCharArray = isPalindromeCharArray(input);

        System.out.println("Palindrome check using Iterative method: " + resultIterative);
        System.out.println("Palindrome check using Recursive method: " + resultRecursive);
        System.out.println("Palindrome check using Char Array method: " + resultCharArray);
    }
}
