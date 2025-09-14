import java.util.Random;

public class ZaraBonusCalculator {


    public static double[][] generateEmployeeData(int numEmployees) {
        double[][] data = new double[numEmployees][2]; // [][0] = salary, [][1] = years of service
        Random rand = new Random();

        for (int i = 0; i < numEmployees; i++) {
            int salary = 10000 + rand.nextInt(90000); // Random 5-digit salary
            int years = 1 + rand.nextInt(10); // Random years of service from 1 to 10
            data[i][0] = salary;
            data[i][1] = years;
        }

        return data;
    }

    // Calculate bonus and new salary based on service years
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] newData = new double[numEmployees][4];
        // Columns: 0 = Old Salary, 1 = Years, 2 = Bonus, 3 = New Salary

        for (int i = 0; i < numEmployees; i++) {
            double oldSalary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = oldSalary * bonusRate;
            double newSalary = oldSalary + bonus;

            newData[i][0] = oldSalary;
            newData[i][1] = years;
            newData[i][2] = bonus;
            newData[i][3] = newSalary;
        }

        return newData;
    }

    // Display results in tabular format with totals
    public static void displayData(double[][] data) {
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.printf("%-10s %-15s %-15s %-15s\n", "Emp ID", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            double oldSalary = data[i][0];
            double years = data[i][1];
            double bonus = data[i][2];
            double newSalary = data[i][3];

            System.out.printf("%-10d %-15.2f %-15.0f %-15.2f %-15.2f\n",
                    (i + 1), oldSalary, years, bonus, newSalary);

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15s %-15.2f %-15.2f\n",
                "Total", totalOldSalary, "-", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Step 1: Generate random data
        double[][] employeeData = generateEmployeeData(numEmployees);

        // Step 2: Calculate bonus and new salary
        double[][] finalData = calculateBonusAndNewSalary(employeeData);

        // Step 3: Display all data
        displayData(finalData);
    }
}
