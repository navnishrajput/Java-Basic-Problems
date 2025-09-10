import java.util.Scanner;

public class Fee {

        public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);
            System.out.println("Enter fees: ");

            double fee = scanner.nextDouble();
            System.out.println("Enter Discount: ");
            double discountPercent = scanner.nextDouble();

            double discountAmount = fee * (discountPercent / 100);
            double finalFee = fee - discountAmount;

            System.out.printf("The discount amount is INR %.2f%n", discountAmount);
            System.out.printf("The final discounted fee is INR %.2f", finalFee);
        }
    }

