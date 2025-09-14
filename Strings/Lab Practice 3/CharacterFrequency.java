import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        int len = text.length();

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            if (freq[text.charAt(i)] != 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -freq[text.charAt(i)]; // mark as counted
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            int count = -freq[ch];
            if (count > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(count);
                index++;
                freq[ch] = 0; // mark as stored
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[][] freqResult = findFrequency(input);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < freqResult.length; i++) {
            System.out.println(freqResult[i][0] + "\t\t" + freqResult[i][1]);
        }
    }
}
