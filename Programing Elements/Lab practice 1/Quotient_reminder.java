import java.util.Scanner;

public class Quotient_reminder {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Enter the number1 and number2:");
            int num1 = Sc.nextInt();
            int num2 = Sc.nextInt();
             
            int ques = num1/num2;
            int remin = num1%num2;
            System.out.println("The Quotient is"+ques+"The reminder is"+remin+"of two numbers");
        }
        
    }
}
