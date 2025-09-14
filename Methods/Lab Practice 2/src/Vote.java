import java.util.Scanner;

public class Vote {

    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentAges = new int[10];

        System.out.println("Enter the ages of 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < 10; i++) {
            boolean canVote = canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") - Can vote");
            } else {
                if (studentAges[i] < 0) {
                    System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") - Invalid age, cannot vote");
                } else {
                    System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") - Cannot vote");
                }
            }
        }
    }
}