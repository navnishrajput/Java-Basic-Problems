import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];  
        double total = 0.0;                 
        int index = 0;                      

        System.out.println("Enter up to 10 positive numbers (enter 0 or negative number to stop):");

        while (true) {
            double num = sc.nextDouble();

            if (num <= 0) {
                break; 
            }
            if (index == 10) {
                break; 
            }

            numbers[index] = num;
            index++;
        }

        System.out.println("\nYou entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("\nThe sum of all numbers is: " + total);
    }
}
