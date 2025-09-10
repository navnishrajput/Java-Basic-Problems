import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Number " + num1 + " is largest");
            if (num2 >= num3) {
                System.out.println("Number " + num2 + " is second largest");
                System.out.println("Number " + num3 + " is 3rd");
            } else {
                System.out.println("Number " + num3 + " is second largest");
                System.out.println("Number " + num2 + " is 3rd");
            }
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Number " + num2 + " is largest");
            if (num1 >= num3) {
                System.out.println("Number " + num1 + " is second largest");
                System.out.println("Number " + num3 + " is 3rd");
            } else {
                System.out.println("Number " + num3 + " is second largest");
                System.out.println("Number " + num1 + " is 3rd");
            }
        } else {
            System.out.println("Number " + num3 + " is largest");
            if (num1 >= num2) {
                System.out.println("Number " + num1 + " is second largest");
                System.out.println("Number " + num2 + " is 3rd");
            } else {
                System.out.println("Number " + num2 + " is second largest");
                System.out.println("Number " + num1 + " is 3rd");
            }
        }
    }
}