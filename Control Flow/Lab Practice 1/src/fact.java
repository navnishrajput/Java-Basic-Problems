import java.util.Scanner;

public class fact {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num<=0){
            System.out.print("Enter positive number. ");
            return;
        }
        int num2 = 1;
        int temp = num;
        while (temp>1){
            num2 *= temp;
            temp--;
        }
        System.out.println("Factorial of this number: "+num2);
    }
}
