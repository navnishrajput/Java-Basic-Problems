import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = Sc.nextInt();
          int fact = 1;
          int i = 1;
        do {
            fact = fact * i;   
            i++;
        } while (i <= num);

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
