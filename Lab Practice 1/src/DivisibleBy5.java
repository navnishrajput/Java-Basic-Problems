import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any number to check  is number divisible by 5 or not: ");
        int number = sc.nextInt();
        if(number %5 == 0){
            System.out.println("Yes "+ number+ " is divisible by 5.");
        }else {
            System.out.println("No number is not divisible by 5");
        }

    }
}
