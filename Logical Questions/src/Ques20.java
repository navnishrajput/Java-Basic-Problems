import java.util.Scanner;

public class Ques20 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter the 10 no.");
        for (int i = 0; i < 10; i++) {
            arr[i] = Sc.nextInt();
        }

        int largest = arr[0];
        int secondlargest = arr[0];

        for (int i=0; i<10; i++) {
            if (arr[i]>largest) {
                largest = arr[i];
            }
        }

        // find second largest
        for (int i=0; i<10; i++) {
            if (arr[i] > secondlargest && arr[i]<largest) {
                secondlargest = arr[i];
            }
        }

        System.out.println("Second largest number is: " + secondlargest);

    }
}
