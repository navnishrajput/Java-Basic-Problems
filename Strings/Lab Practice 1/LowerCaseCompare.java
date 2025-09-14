import java.util.Scanner;

public class LowerCaseCompare {

    public static String convertToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result = result + ch;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = sc.nextLine();

        String builtInLower = input.toLowerCase();
        String manualLower = convertToLower(input);

        System.out.println("Built-in lowercase: " + builtInLower);
        System.out.println("Manual lowercase: " + manualLower);

        boolean isSame = compareStrings(builtInLower, manualLower);
        System.out.println("Both results are same: " + isSame);
    }
}
