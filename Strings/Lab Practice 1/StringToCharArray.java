import java.util.Scanner;

public class StringToCharArray {

    public static char[] myToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] arr1 = myToCharArray(text);
        char[] arr2 = text.toCharArray();

        boolean result = compareArrays(arr1, arr2);

        System.out.print("User-defined char array: ");
        for (char c : arr1) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Built-in char array: ");
        for (char c : arr2) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are both arrays same? " + result);
       
    }
}
