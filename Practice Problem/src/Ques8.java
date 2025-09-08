import java.util.Scanner;

public class Ques8 {

    public static void main(String []args){
    Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Base");
        int base = Sc.nextInt();
        System.out.println("Enter the Exponent");
        int exponent = Sc.nextInt();
        double rr =Math.pow(base ,exponent);
        System.out.println(rr);


    }
}
