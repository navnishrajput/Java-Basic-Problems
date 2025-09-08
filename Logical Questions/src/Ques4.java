import java.util.Scanner;

public class Ques4 {
   


        public static void main(String []args){
            System.out.println("Enter two number: ");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();
            if(num1 > num2){
                System.out.println("Number 1 is greater then number two:" +num1);
            }
            else {
                System.out.println("Number 2 is greater then number one:" +num2);
            }
        }
    }


