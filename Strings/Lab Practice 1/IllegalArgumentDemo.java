import java.util.Scanner;

public class IllegalArgumentDemo {
    
    public static void generateException(String str) {
        System.out.println(str.substring(5,2));
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.substring(5,2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();

        try {
            generateException(s);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }

        handleException(s);
    }
}
