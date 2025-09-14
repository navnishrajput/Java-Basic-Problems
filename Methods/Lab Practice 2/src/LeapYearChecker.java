import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            return;
        }

        int year = scanner.nextInt();

        if (year < 1582) {
            System.out.println("Error: Year must be 1582 or later (Gregorian calendar).");
            return;
        }

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}