
    import java.util.Scanner;

    public class SumUntilZeroOrNegative {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double total = 0.0;

            System.out.println("Enter numbers to add (enter 0 or negative number to stop):");

            while (true) {
                System.out.print("Enter a number: ");
                double number = scanner.nextDouble();

                if (number <= 0) {
                    break;
                }
                total += number;
                System.out.println("Current total: " + total);
            }

            System.out.println("The final total sum is: " + total);
        }
    }
