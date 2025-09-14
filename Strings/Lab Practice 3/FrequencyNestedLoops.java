import java.util.Scanner;

public class FrequencyNestedLoops {

    public static String[][] characterFrequency(String text) {
        char[] chars = text.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];

        for (int i = 0; i < len; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') uniqueCount++;
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index][0] = String.valueOf(chars[i]);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[][] freqResult = characterFrequency(input);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < freqResult.length; i++) {
            System.out.println(freqResult[i][0] + "\t\t" + freqResult[i][1]);
        }
    }
}
