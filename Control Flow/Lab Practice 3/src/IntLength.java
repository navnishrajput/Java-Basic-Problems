import java.util.Scanner;

public class IntLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;
        int originalNumber = number;


        if (number == 0) {
            count = 1;
        } else {

            if (number < 0) {
                number = -number;
            }
            while (number > 0) {
                number = number / 10;
                count++;
            }
        }

        System.out.println("The number " + originalNumber + " has " + count + " digit(s).");
    }
}