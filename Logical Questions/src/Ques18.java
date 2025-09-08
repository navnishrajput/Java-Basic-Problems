import java.util.Scanner;

public class Ques18 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = Sc.next();

         for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ' ') {
                break; 
            }
            System.out.println(s.charAt(i));
    }
    }
}
