import java.util.Scanner;

public class Circle {

    //double radius;

    void area(double radius){
//        this.radius = radius;
//
//        return Math.PI.radius*radius;
        double result = Math.PI*radius*radius;
        System.out.println("Area of circle is: "+result);


    }
    void Circumference(double radius){
        double result = 2*Math.PI*radius;
        System.out.println("Circumference is: "+result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c = new Circle();
        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();
        c.area(radius);
        c.Circumference(radius);
    }

}
