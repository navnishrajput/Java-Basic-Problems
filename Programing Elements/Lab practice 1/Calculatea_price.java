import java.util.Scanner;

public class Calculatea_price {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Enter the unitprice and quantity of iteam:");
            int unitprice = Sc.nextInt();
            double quantity = Sc.nextDouble();
             double totalPrice = unitprice * quantity;
            System.out.println("The total purchase price is INR " + totalPrice +
                               " if the quantity " + quantity +
                               " and unit price is INR " + unitprice);
        }
    }
}
