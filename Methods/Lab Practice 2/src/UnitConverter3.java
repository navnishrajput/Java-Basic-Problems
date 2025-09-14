public class UnitConverter3{

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F = " + celsius + "°C");

        double convertedBackFahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C = " + convertedBackFahrenheit + "°F");

        double pounds = 10.0;
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds = " + kilograms + " kilograms");

        double convertedBackPounds = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms = " + convertedBackPounds + " pounds");

        double gallons = 5.0;
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons = " + liters + " liters");

        double convertedBackGallons = convertLitersToGallons(liters);
        System.out.println(liters + " liters = " + convertedBackGallons + " gallons");
    }
}