import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightCm = scanner.nextDouble();

        double heightM = heightCm / 100;


        double bmi = weight / (heightM * heightM);


        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal weight";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        System.out.println("\n=== BMI CALCULATION RESULTS ===");
        System.out.printf("Weight: %.2f kg%n", weight);
        System.out.printf("Height: %.2f cm (%.2f m)%n", heightCm, heightM);
        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("Weight Status: " + status);


        System.out.println("\n=== BMI CATEGORIES ===");
        System.out.println("Underweight: BMI < 18.5");
        System.out.println("Normal weight: BMI 18.5 - 24.9");
        System.out.println("Overweight: BMI 25 - 29.9");
        System.out.println("Obese: BMI ≥ 30");
    }
}