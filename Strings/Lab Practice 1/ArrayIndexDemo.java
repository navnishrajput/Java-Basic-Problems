import java.util.Scanner;

public class ArrayIndexDemo {

    public static void generateException(String[] arr) {
        System.out.println(arr[5]);
    }

    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        System.out.println("Enter 3 names");
        for(int i=0;i<3;i++) {
            names[i] = sc.nextLine();
        }

        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }

        handleException(names);
    }
}
