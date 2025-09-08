import java.util.Scanner;

public class Ques2 {
    public int add(int a , int b){
        int c = a+b;
        return c;

    }
    public static void main(String []args){
        Ques2 obj = new Ques2();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
       int num3= obj.add(num1,num2);
        System.out.println("Result"+num3);

    }



}

