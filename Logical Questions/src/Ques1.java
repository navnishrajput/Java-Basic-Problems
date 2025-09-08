import java.util.Scanner;

public class Ques1 {
    public static void main(String []args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the User name");
        String name = Sc.next();
        System.out.println("Enter the User age");
        int age = Sc.nextInt();
        System.out.println("Hello!!! "+name+" You are " +age+" old");

    }
}
