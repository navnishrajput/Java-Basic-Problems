import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Please enter a positive natural number.");
                return;
            }

            System.out.println("Odd and even numbers from 1 to " + num + ":");

            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        }
    }
}