import java.util.Scanner;

public class WindChillCalculator {

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double temp = scanner.nextDouble();

        System.out.print("Enter wind speed in mph: ");
        double windSpeed = scanner.nextDouble();

        if (temp > 50 || windSpeed <= 3) {
            System.out.println("Wind chill calculation is only valid for temperatures ≤ 50°F and wind speeds > 3 mph");
        } else {
            double windChill = calculateWindChill(temp, windSpeed);
            System.out.println("Wind chill temperature: " + String.format("%.1f", windChill) + "°F");
        }
    }
}