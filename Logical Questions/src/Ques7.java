import java.util.Scanner;

public class Ques7 {
    public static void main(String []args){
        //System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int num1 = sc.nextInt();
        if(num1 >90){
            System.out.println("Grade A");
        } else if (num1 >89) {
            System.out.println("Grade B");

        } else if (num1 > 74) {
            System.out.println("Grade c");

        }else {
            System.out.println("Fail.......");
        }

    }
}
