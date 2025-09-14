import java.util.Scanner;

public class Maths {

    public static double[] findRoots(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                return new double[0];
            }
            double root = -c / b;
            return new double[]{root};
        }

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[0];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficients for quadratic equation ax² + bx + c = 0");
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double[] roots = findRoots(a, b, c);

        System.out.println("\nEquation: " + a + "x² + " + b + "x + " + c + " = 0");

        if (roots.length == 0) {
            System.out.println("No real roots exist (discriminant is negative)");
        } else if (roots.length == 1) {
            System.out.println("One real root: x = " + roots[0]);
        } else {
            System.out.println("Two real roots: x = " + roots[0] + " and x = " + roots[1]);
        }
    }
}