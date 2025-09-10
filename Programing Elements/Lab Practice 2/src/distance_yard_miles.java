import java.util.Scanner;

public class distance_yard_miles {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("Enter the distance in feet:");
            double feet =Sc.nextDouble();
            double distanceInYards = feet / 3;
            double distanceInMiles = distanceInYards / 1760;


            System.out.println("The distance in yards is " + distanceInYards +
                    " while the distance in miles is " + distanceInMiles);
        }
    }
}