import java.util.Scanner;

public class area_of_triangle {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Enetr the base and height:");
            double base = Sc.nextDouble();
            double height = Sc.nextDouble();
            System.out.println("Enter the area of triangle:");
            double areaCm = 0.5 * base * height;
            double areaIn = areaCm / 6.4516;
            System.out.println("The area of the triangle is " + areaCm + " square cm and " + areaIn + " square inches.");
        }
    }

}