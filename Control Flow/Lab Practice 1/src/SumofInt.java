import java.util.Scanner;

public class SumofInt {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Natural positive number:  ");
        int num = sc.nextInt();
        if (num<=0){
            System.out.println("Please enter valid number. ");
            return;
        }

        int Sum =  num*(num+1)/2;

        int Sum1 = 0;
        int Counter =1;
        while(Counter<=num){
            Sum1 += Counter;
            Counter++;
        }
        System.out.println("Sum of method 1st: "+Sum);
        System.out.println("Sum of method 2nd: "+Sum1);
        if (Sum == Sum1){
            System.out.println("Answer is same using both methos");
        }else {
            System.out.println("Error in methos");
        }
    }
}
