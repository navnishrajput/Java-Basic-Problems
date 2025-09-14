import java.util.Scanner;

public class SplitTextDemo {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] manualSplit(String text) {
        int len = findLength(text);
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndex = new int[spaceCount + 2];
        int idx = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx] = i;
                idx++;
            }
        }
        spaceIndex[idx] = len;

        String[] words = new String[spaceCount + 1];
        int start = 0;
        for (int i = 1; i <= spaceCount + 1; i++) {
            int end = spaceIndex[i];
            String w = "";
            for (int j = start; j < end; j++) {
                w = w + text.charAt(j);
            }
            words[i - 1] = w;
            start = end + 1;
        }
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = sc.nextLine();

        String[] builtInSplit = input.split(" ");
        String[] manualSplitResult = manualSplit(input);

        System.out.println("Built-in split result:");
        for (String s : builtInSplit) {
            System.out.println(s);
        }

        System.out.println("Manual split result:");
        for (String s : manualSplitResult) {
            System.out.println(s);
        }

        boolean same = compareArrays(builtInSplit, manualSplitResult);
        System.out.println("Both results are same: " + same);
    }
}
