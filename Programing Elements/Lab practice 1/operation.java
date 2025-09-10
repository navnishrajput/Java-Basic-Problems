import java.util.Scanner;

public class operation{
    public static void main(String args[]){
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Enter the number 1 to calculate:");
            int num1 = Sc.nextInt();
            System.out.println("Enter the number 2 to calculate:");
            int num2 =Sc.nextInt();

            int add = num1+num2;
            int sub = num1-num2;
            float div = num1/num2;
            int mul = num1*num2;

              System.out.println("Result of addition:"+add);
              System.out.println("Result of  subtraction:"+sub);
              System.out.println("Result of division:"+div);
              System.out.println("Result of multiplication:"+mul);
        }
    }
}