import java.util.Scanner;

public class Km_to_miles {


        public static void main(String[] args) {
            Scanner Sc = new Scanner(System.in);
            System.out.println("Convert Km to miles\n Enter in KM");

            double km = Sc.nextDouble();
            double miles = 1.6;
            double ans = km*miles;
            System.out.println();
            System.out.println("The distance "+km+ " km in miles is "+ans);


        }
    }


