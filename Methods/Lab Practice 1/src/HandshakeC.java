import java.util.Scanner;

public class HandshakeC {

    public static int Handshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        if (numberOfStudents < 0) {
            System.out.println("Please enter a non-negative number of students.");
        } else {
            int maxHandshakes = Handshakes(numberOfStudents);
            System.out.println("Maximum number of handshakes among " + numberOfStudents + " students: " + maxHandshakes);
        }
    }
}