public class UnitConverter2 {

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        double yards = 5.0;
        double feet = convertYardsToFeet(yards);
        System.out.println(yards + " yards = " + feet + " feet");

        double convertedBackYards = convertFeetToYards(feet);
        System.out.println(feet + " feet = " + convertedBackYards + " yards");

        double meters = 2.0;
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meters = " + inches + " inches");

        double convertedBackMeters = convertInchesToMeters(inches);
        System.out.println(inches + " inches = " + convertedBackMeters + " meters");

        double inchesValue = 12.0;
        double centimeters = convertInchesToCentimeters(inchesValue);
        System.out.println(inchesValue + " inches = " + centimeters + " centimeters");
    }
}