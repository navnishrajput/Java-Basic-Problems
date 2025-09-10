import java.util.Scanner;

public class springsession {
    public static void main(String []args){
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the day");
        int day = Sc.nextInt();
        System.out.println("Enter the month");
        int month = Sc.nextInt();
        if ((month == 3 && day >= 20) ||
                (month == 4 && day >= 1 && day <= 30) ||
                (month == 5 && day >= 1 && day <= 31) ||
                (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        }
    }

