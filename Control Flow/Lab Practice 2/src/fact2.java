import java.util.Scanner;

public class fact2 {
    public static void main(String []args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num<=0){
                System.out.print("Enter positive number. ");
                return;
            }
            int num2 = 1;
            //int temp = num;
            for (int temp = num; temp>=1; temp--) {
                num2 *= temp;

            }

            System.out.println("Factorial of this number: "+num2);
        }
    }
}