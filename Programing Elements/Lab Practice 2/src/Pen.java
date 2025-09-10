public class Pen{
    public static void main(String[] args) {
        int totalPens = 14;
        int numberOfStudents = 3;

        int pensPerStudent = totalPens / numberOfStudents;
        int remainingPens = totalPens % numberOfStudents;

        System.out.println("Total pens: " + totalPens);
        System.out.println("Number of students: " + numberOfStudents);
        System.out.println("-----------------------------");
        System.out.println("Pens per student: " + pensPerStudent);
        System.out.println("Remaining pens: " + remainingPens);
    }
}