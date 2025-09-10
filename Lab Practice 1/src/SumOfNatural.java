import java.util.Scanner;

public class SumOfNatural {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no. of integer");
        int length=sc.nextInt();
        int []arr = new int[length];
        System.out.println("Enter the integers: ");
        for(int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of the numbers: " + sum);
    }
}
