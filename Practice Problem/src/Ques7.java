import java.util.Scanner;

public class Ques7 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Perimeter of a Rectangle");

            System.out.print("Enter Length: ");
            float length = sc.nextFloat();
            System.out.print("Enter width: ");
            float width = sc.nextFloat();
            float perimeter = (length + width) * 2;
            System.out.printf("Volume: %.2f%n", perimeter);
        }
    }
