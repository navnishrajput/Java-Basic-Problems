import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Amar's age: ");
            int ageAmar = sc.nextInt();
            System.out.print("Enter Akbar's age: ");
            int ageAkbar = sc.nextInt();
            System.out.print("Enter Anthony's age: ");
            int ageAnthony = sc.nextInt();

            System.out.print("Enter Amar's height (in cm): ");
            int heightAmar = sc.nextInt();
            System.out.print("Enter Akbar's height (in cm): ");
            int heightAkbar = sc.nextInt();
            System.out.print("Enter Anthony's height (in cm): ");
            int heightAnthony = sc.nextInt();

            String youngest;
            if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
                youngest = "Amar";
            } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
                youngest = "Akbar";
            } else {
                youngest = "Anthony";
            }

            String tallest;
            if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
                tallest = "Amar";
            } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
                tallest = "Akbar";
            } else {
                tallest = "Anthony";
            }
            System.out.println("The youngest friend is " + youngest);
            System.out.println("The tallest friend is " + tallest);
        }
    }
}
