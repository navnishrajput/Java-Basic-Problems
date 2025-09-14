import java.util.Scanner;

public class RunningRounds{

    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = calculatePerimeter(side1, side2, side3);
        double totalDistanceMeters = 5000;
        double rounds = totalDistanceMeters / perimeter;
        return (int) Math.ceil(rounds);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = scanner.nextDouble();

        int rounds = calculateRounds(side1, side2, side3);

        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");
    }
}