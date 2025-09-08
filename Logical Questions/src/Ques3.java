import java.util.Scanner;

public class Ques3 {
    public static void main(String []args){
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

         if(num1 %2 == 0){
             System.out.println("Even");
         }
         else {
             System.out.println("odd");
         }
    }
}
