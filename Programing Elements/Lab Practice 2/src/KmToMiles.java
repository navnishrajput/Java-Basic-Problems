import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Convert Km to miles.(10km)");
        double km = 10.8;
        double miles = 1.6;
        double ans = km*miles;
        System.out.println();
        System.out.println("The distance "+km+ " km in miles is "+ans);


    }
}
