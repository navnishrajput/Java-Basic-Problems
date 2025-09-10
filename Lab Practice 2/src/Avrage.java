import java.util.Scanner;

public class Avrage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate average of PCM");
        System.out.println("Marks in Maths: 94");
        System.out.println("Marks in Psychics: 95");
        System.out.println("Marks in chemistry: 96 ");
        int num1 = 94;
        int num2 = 95;
        int num3 = 96;
        int avrg = (num1+num2+num3)/3;
        System.out.println();
        System.out.println("Average of this 3 Subjects is: " +avrg);



    }

}
