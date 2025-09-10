import java.util.Scanner;

public class Smallest3 {

        public static void main(String []args){
            System.out.println("Enter three numbers: ");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.print("Enter third number: ");
            int num3 = sc.nextInt();
            if(num1 < num2 && num1 < num3){
                System.out.println("Number 1 is smallest then other two numbers:" +num1);
            } else if (num2 < num3) {
                System.out.println("Number 2 is smallest then other two numbers:" + num2);

            }
            else {
                System.out.println("Number 3 is smallest then other two numbers:" + num3);
            }
        }
    }






