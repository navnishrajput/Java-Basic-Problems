import java.util.Scanner;

public class Ques19 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the number");
        String num = Sc.next();  
        String reversed = "";    

        for (int i = num.length()-1; i>=0; i--) {
            reversed = reversed + num.charAt(i);
        }

        if (num.equals(reversed)) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome");
        }

    
    }
}
