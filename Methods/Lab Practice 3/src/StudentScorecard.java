import java.util.Scanner;
import java.util.Random;

public class StudentScorecard {

    // Generate random scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // [][0] = Physics, [][1] = Chemistry, [][2] = Math

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 40 + rand.nextInt(61); // Physics score: 40 to 100
            scores[i][1] = 40 + rand.nextInt(61); // Chemistry score
            scores[i][2] = 40 + rand.nextInt(61); // Math score
        }

        return scores;
    }

    // Calculate total, average, percentage, and grade
    public static Object[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        Object[][] results = new Object[numStudents][6];
        // Columns: Physics, Chemistry, Math, Total, Percentage, Grade

        for (int i = 0; i < numStudents; i++) {
            int phy = scores[i][0];
            int chem = scores[i][1];
            int math = scores[i][2];
            int total = phy + chem + math;
            double average = total / 3.0;
            double percentage = Math.round((average * 100.0) / 100); // Round to 2 digits

            // Assign grade
            String grade;
            if (percentage >= 80)
                grade = "A";
            else if (percentage >= 70)
                grade = "B";
            else if (percentage >= 60)
                grade = "C";
            else if (percentage >= 50)
                grade = "D";
            else if (percentage >= 40)
                grade = "E";
            else
                grade = "R";

            results[i][0] = phy;
            results[i][1] = chem;
            results[i][2] = math;
            results[i][3] = total;
            results[i][4] = percentage;
            results[i][5] = grade;
        }

        return results;
    }

    // Display results in tabular format
    public static void displayResults(Object[][] results) {
        System.out.println("ID\tPhysics\tChemistry\tMath\tTotal\tPercentage\tGrade");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < results.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t\t%s\n",
                    (i + 1),
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    results[i][3],
                    results[i][4],
                    results[i][5]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step a: Take number of students
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        // Step b: Generate random scores
        int[][] scores = generateScores(numStudents);

        // Step c: Calculate results
        Object[][] results = calculateResults(scores);

        // Step d: Display results
        displayResults(results);

        scanner.close();
    }
}
