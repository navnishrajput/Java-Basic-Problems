import java.util.Scanner;

public class Ques11 {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number: ");
        int num1 = sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i*num1);

        }
    }
}
