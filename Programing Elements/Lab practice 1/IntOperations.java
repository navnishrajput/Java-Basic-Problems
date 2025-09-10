import java.util.Scanner;

public class IntOperations {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Enetr the variables");
            int a=Sc.nextInt();
            int b=Sc.nextInt();
            int c=Sc.nextInt();
             
            int result1=  a + b *c;
            int result2=  a * b + c;
            int result3=  c + a / b;
            int result4=  a % b + c;

            System.out.println("Result of int operations are"+result1+result2+"and"+result3+result4);
        }

    }
}
