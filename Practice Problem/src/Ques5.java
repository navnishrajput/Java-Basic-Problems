import java.util.Scanner;

public class Ques5 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius");
        double radius = sc.nextDouble();
        System.out.println("Enter the Height");
        double height = sc.nextDouble();
        double pi = Math.PI;
        double Volume =(pi* radius*radius * height);
        System.out.printf("Volume: %.2f%n", Volume);
    }
}
