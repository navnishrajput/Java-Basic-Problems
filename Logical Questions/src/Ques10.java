import java.util.Scanner;

public class Ques10 {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number: ");
        int number = sc.nextInt();
        String result = (number % 3 == 0 && number % 5 == 0)
                ? number + " is divisible by both 3 and 5"
                : number + " is NOT divisible by both 3 and 5";
        System.out.println(result);
    }
}
