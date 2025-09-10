import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + friends[i] + ":");
            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            System.out.print("Height (cm): ");
            heights[i] = scanner.nextDouble();
            System.out.println();
        }

        int youngestAge = ages[0];
        String youngestFriend = friends[0];

        double tallestHeight = heights[0];
        String tallestFriend = friends[0];

        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = friends[i];
            }

            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = friends[i];
            }
        }

        System.out.println("Youngest friend: " + youngestFriend + " (Age: " + youngestAge + ")");
        System.out.println("Tallest friend: " + tallestFriend + " (Height: " + tallestHeight + " cm)");

        scanner.close();
    }
}