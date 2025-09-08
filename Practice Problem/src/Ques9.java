import java.util.Scanner;

public class Ques9 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third number");
        int num3 = sc.nextInt();
        int num4 = (num1+num2+num3)/3;
        System.out.println("Average"+num4);

    }
}
