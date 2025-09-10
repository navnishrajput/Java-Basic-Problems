import java.util.Scanner;

public class BMIMULTI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");

            double weight;
            do {
                System.out.print("Enter weight in kg: ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter positive weight value.");
                }
            } while (weight <= 0);

            double heightCm;
            do {
                System.out.print("Enter height in cm: ");
                heightCm = scanner.nextDouble();
                if (heightCm <= 0) {
                    System.out.println("Please enter positive height value.");
                }
            } while (heightCm <= 0);

            double heightM = heightCm / 100;
            double bmi = weight / (heightM * heightM);

            personData[i][0] = weight;
            personData[i][1] = heightCm;
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n=== PERSON BMI DATA ===");
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s%n",
                    i + 1,
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    weightStatus[i]);
        }

        scanner.close();
    }
}