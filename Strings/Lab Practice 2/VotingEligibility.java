import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    public static int[] randomAges(int n) {
        int[] ages = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = r.nextInt(83) + 18; 
        }
        return ages;
    }

    public static String[][] canVote(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void displayTable(String[][] data) {
        System.out.println("Age\tCan Vote");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
        }

        String[][] result = canVote(ages);
        displayTable(result);
    }
}
