import java.util.Scanner;

public class HandshakeC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("Maximum number of handshakes among " + numberOfStudents + " students: " + maxHandshakes);
    }
}