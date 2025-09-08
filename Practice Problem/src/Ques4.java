import java.util.Scanner;

public class Ques4 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius= sc.nextDouble();
        double pi = Math.PI;
        double area= (pi* radius*radius);

        System.out.println("The area of circle "+area);
    }

}
