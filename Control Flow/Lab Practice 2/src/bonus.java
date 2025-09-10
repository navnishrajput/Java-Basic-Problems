import java.util.Scanner;
public class bonus {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Employee Salary: ");
            double salary = sc.nextDouble();
            System.out.println("Enter serve year: ");
            int service = sc.nextInt();

            double bonus = 0;
            if (service > 5) {
                bonus = salary * 0.05;
                System.out.println("Congratulations! 5% bonus for loyal service");
            } else {
                System.out.println("Chlll Nikal beee (5 saal pura kr)");
            }

            System.out.println("Salary of employee: " + salary);
            System.out.println("Bonus amount: " + bonus);
            System.out.println("Salary of employee with bonus: " + (salary + bonus));
        }
    }
}
