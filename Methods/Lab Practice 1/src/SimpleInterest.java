import java.util.Scanner;

public class SimpleInterest {

    public static double calculateSI(double principal, double rate, double time) {
        double si = (principal * rate * time) / 100;
        return si;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double simpleInterest = calculateSI(principal, rate, time);


        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}