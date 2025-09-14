import java.util.Scanner;

public class TrimString {


    public static int[] trimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

   
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

     
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }


    public static String mySubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }


    public static boolean myEquals(String s1, String s2) {
       
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

        System.out.println("Enter a string with leading and trailing spaces:");
        String input = sc.nextLine();


        int[] indexes = trimIndexes(input);

 
        String trimmedCustom = mySubstring(input, indexes[0], indexes[1]);


        String trimmedBuiltIn = input.trim();


        boolean isSame = myEquals(trimmedCustom, trimmedBuiltIn);


        System.out.println("Original String: \"" + input + "\"");
        System.out.println("Custom Trimmed: \"" + trimmedCustom + "\"");
        System.out.println("Built-in Trimmed: \"" + trimmedBuiltIn + "\"");
        System.out.println("Both methods give same result? " + isSame);
    }
}
