import java.util.Scanner;

public class Ques3 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celcius");
        int celcius = sc.nextInt();
        int fahrenheit = (celcius * 9/5)+32;

        System.out.println("This is result"+fahrenheit);


    }
}
