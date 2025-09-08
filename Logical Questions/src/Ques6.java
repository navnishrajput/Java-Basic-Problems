import java.util.Scanner;

public class Ques6 {

        public static void main(String []args){
            System.out.println("Enter three numbers: ");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.println("Enter third number: ");
            int num3 = sc.nextInt();
            if(num1 > num2 && num1 > num3){
                System.out.println("Number 1 is greater then other two numbers:" +num1);
            } else if (num2 > num3) {
                System.out.println("Number 2 is greater then other two numbers:" + num2);

            }
            else {
                System.out.println("Number 3 is greater then other two numbers:" + num3);
            }
        }
    }




