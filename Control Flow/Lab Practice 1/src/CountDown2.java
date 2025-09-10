import java.util.Scanner;

public class CountDown2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }

        System.out.println("Your Rocket Launch..... 🚀");
    }
}