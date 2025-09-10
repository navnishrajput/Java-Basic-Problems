 import java.util.Scanner;
public class DoubleOperations {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Enetr the variables");
            double a=Sc.nextInt();
            double b=Sc.nextInt();
            double c=Sc.nextInt();
             
            double result1=  a + b *c;
            double result2=  a * b + c;
            double result3=  c + a / b;
            double result4=  a % b + c;

            System.out.println("Result of double operations are"+result1+result2+"and"+result3+result4);
        }

    }
}


