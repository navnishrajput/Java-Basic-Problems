import java.util.Scanner;

public class Ques6 {public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Calculate simple interest");

    System.out.print("Enter Principal amount: ");
    float principal = sc.nextFloat();
    System.out.print("Enter Rate of interest: ");
    float rate = sc.nextFloat();
    System.out.print("Enter Time: ");
    float time = sc.nextFloat();
    float SimpleInt = (principal*rate*time)/100;
    System.out.printf("Volume: %.2f%n", SimpleInt);
}
}
