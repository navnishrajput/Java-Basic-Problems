import java.util.Scanner;

public class side_of_square {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Enetr the Parameter of triangle:");
            double par = Sc.nextDouble();
            System.out.println("Enetr the sides:");
            double result = 4*par;
            System.out.println("The length of the side is "+result + "whose perimeter is: "+par);
        }
    }
}