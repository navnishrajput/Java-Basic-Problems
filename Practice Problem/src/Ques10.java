import java.util.Scanner;

public class Ques10 {
    public static void main(String []args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the distance");
        double dis = Sc.nextDouble();
        double miles = (dis * 0.621371);
        System.out.printf("In miles: %.3f%n", miles);
    }
}
