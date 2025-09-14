import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void generateException(String text) {
        // Accessing index beyond the length
        System.out.println("Character at index 10: " + text.charAt(10));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: Invalid index access.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\nCalling method to generate Exception:");
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("\nCalling method to handle Exception properly:");
        handleException(text);

        
    }
}
