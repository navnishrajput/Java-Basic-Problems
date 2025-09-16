import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s1.nextInt();
        int sum= 0;
        while(num !=0){
            sum += num%10;
            num /=10;

        }
        System.out.println("Sum of digit: "+sum);


    }
}
