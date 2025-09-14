import java.util.Scanner;

public class Chocolate{

    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        if (numberOfChildren == 0) {
            throw new ArithmeticException("Number of children cannot be zero");
        }
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of chocolates: ");
        int chocolates = scanner.nextInt();

        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();

        try {
            int[] results = findRemainderAndQuotient(chocolates, children);
            System.out.println("Each child gets: " + results[0] + " chocolates");
            System.out.println("Remaining chocolates: " + results[1]);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}