import java.util.Scanner;

public class DistanceAndLineEquation {

    // Method to calculate Euclidean distance
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the slope and y-intercept of the line
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1); // slope
        double b = y1 - m * x1; // y-intercept
        return new double[] { m, b };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for two points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate Euclidean distance
        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between the points: " + distance);

        // Calculate line equation
        double[] line = lineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + line[0] + "x + " + line[1]);
    }
}
