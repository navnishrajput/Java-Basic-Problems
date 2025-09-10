import java.util.Scanner;

public class Age {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        int age = sc.nextInt();
        int CureentYear = 2025;
        int C_age = CureentYear - age;
        System.out.println("User current age is: "+C_age);
    }
}
