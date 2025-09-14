import java.util.Scanner;

public class WordLengthTable {

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

    public static String[][] wordWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int l = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(l);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = sc.nextLine();

        String[] words = manualSplit(input);
        String[][] wordLenArray = wordWithLength(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < wordLenArray.length; i++) {
            String word = wordLenArray[i][0];
            int length = Integer.parseInt(wordLenArray[i][1]);
            System.out.println(word + "\t" + length);
        }
    }
}

