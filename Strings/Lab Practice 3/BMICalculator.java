import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";

        return new String[]{String.valueOf(bmi), status};
    }

    public static String[][] computeAllBMI(double[][] data) {
        int n = data.length;
        String[][] result = new String[n][4];

        for (int i = 0; i < n; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            String[] bmiInfo = calculateBMI(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiInfo[0];
            result[i][3] = bmiInfo[1];
        }

        return result;
    }

    public static void displayBMI(String[][] bmiData) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < bmiData.length; i++) {
            System.out.println(bmiData[i][0] + "\t\t" + bmiData[i][1] + "\t\t" + bmiData[i][2] + "\t" + bmiData[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) of person " + (i + 1) + ":");
            data[i][0] = sc.nextDouble();
            System.out.println("Enter height (cm) of person " + (i + 1) + ":");
            data[i][1] = sc.nextDouble();
        }

        String[][] bmiData = computeAllBMI(data);
        displayBMI(bmiData);
    }
}
