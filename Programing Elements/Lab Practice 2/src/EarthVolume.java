public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = Math.PI;
        double kmToMiles = 0.621371;

        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        double volumeMiles = (4.0 / 3.0) * pi * Math.pow(radiusKm * kmToMiles, 3);


        System.out.printf("The volume of earth in cubic kilometers is %.3e%n", volumeKm);
        System.out.println();
        System.out.printf("The volume of earth in cubic miles is %.3e", volumeMiles);
    }
}