import java.util.Scanner;

public class CountDown {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();

        while (num>=1){
            System.out.println(num +"....");
            num--;
        }
        System.out.println("Your Rocket Launch.....");
    }
}
