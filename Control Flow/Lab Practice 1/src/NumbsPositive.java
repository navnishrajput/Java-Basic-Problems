import java.util.Scanner;

public class NumbsPositive {


        public static void main(String []args){
            System.out.println("Enter number: ");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter  number to check( +,-,0 ): ");
            int num1 = sc.nextInt();
            if (num1 >0){
                System.out.println("Number is positive.");
            } else if (num1 < 0) {
                System.out.println("Number is negative.");

            }else {
                System.out.println("Number is zero.");
            }
        }

    }


