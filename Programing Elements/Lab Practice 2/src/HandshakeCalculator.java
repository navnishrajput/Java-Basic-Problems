import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("At least 2 students are needed for handshakes.");
            return;
        }

        int handshakes = (n * (n - 1)) / 2;

        System.out.println("\nMathematical Explanation:");
        System.out.println("Each of the " + n + " students can shake hands with " + (n - 1) + " others");
        System.out.println("But this counts each handshake twice (A shaking B's hand is the same as B shaking A's hand)");
        System.out.println("So we use the formula: (n × (n - 1)) ÷ 2");
        System.out.println("Calculation: (" + n + " × " + (n - 1) + ") ÷ 2 = " + (n * (n - 1)) + " ÷ 2 = " + handshakes);
        System.out.println("\nThe maximum number of handshakes among " + n + " students is: " + handshakes);
    }
}