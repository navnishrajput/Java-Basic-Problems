import java.util.Scanner;

public class CompareStr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string values: ");
        String str = sc.nextLine();
        System.out.println("Enter second value: ");
        String str2 = sc.nextLine();

        int str3 = str.length();
        int str4 = str2.length();
        if(str3==str4){
            System.out.println("length is same");
            boolean str5 = str.equals(str2);
            System.out.println(str5);


        }
        else {
            System.out.println("size is not same");
        }

        String sub = "Hello world";
        String sub1 = sub.substring(0,2);
        System.out.println(sub1);

    }
}
