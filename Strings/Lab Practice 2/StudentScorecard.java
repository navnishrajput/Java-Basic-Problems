import java.util.Scanner;
import java.util.Random;

public class StudentScorecard {

    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];
        Random r = new Random();
        for (int i = 0; i < students; i++) {
            marks[i][0] = r.nextInt(101); // Physics
            marks[i][1] = r.nextInt(101); // Chemistry
            marks[i][2] = r.nextInt(101); // Maths
        }
        return marks;
    }

    public static double[][] calculatePercentage(int[][] marks) {
        int students = marks.length;
        double[][] result = new double[students][3]; // total, average, percentage

        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100.0;

            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }

        return result;
    }

    public static String[] calculateGrade(double[][] percentage) {
        int students = percentage.length;
        String[] grades = new String[students];

        for (int i = 0; i < students; i++) {
            double percent = percentage[i][2];
            if (percent >= 90) grades[i] = "A+";
            else if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B+";
            else if (percent >= 60) grades[i] = "B";
            else if (percent >= 50) grades[i] = "C";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void displayScorecard(int[][] marks, double[][] percentage, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t\t" + marks[i][2] + "\t" +
                    (int)percentage[i][0] + "\t" + percentage[i][1] + "\t" + percentage[i][2] + "\t\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] percentage = calculatePercentage(marks);
        String[] grades = calculateGrade(percentage);

        displayScorecard(marks, percentage, grades);
    }
}
