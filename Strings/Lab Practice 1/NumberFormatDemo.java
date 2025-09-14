import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Number is " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number is " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some text");
        String s = sc.nextLine();

        try {
            generateException(s);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }

        handleException(s);
    }
}
