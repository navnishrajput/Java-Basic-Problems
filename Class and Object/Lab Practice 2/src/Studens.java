import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    double marks;

    void calculateGrade() {
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        calculateGrade();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter Student Name: ");
        student.name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        student.rollNumber = scanner.nextInt();

        System.out.print("Enter Marks: ");
        student.marks = scanner.nextDouble();

        System.out.println("\n=== Student Report ===");
        student.displayDetails();
    }
}